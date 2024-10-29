package proyectoPOO.PuntodeVenta.controller;

import proyectoPOO.PuntodeVenta.entity.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final List<Cliente> clientes = new ArrayList<>();

    // Crear cliente (POST)
    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    // Obtener todos los clientes (GET)
    @GetMapping
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    // Actualizar un cliente (PATCH)
    @PatchMapping("/{id}")
    public Cliente actualizarCliente(@PathVariable String id, @RequestBody Cliente clienteActualizado) {
        Optional<Cliente> clienteExistente = clientes.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst();

        if (clienteExistente.isPresent()) {
            Cliente cliente = clienteExistente.get();
            if (clienteActualizado.getNombre() != null) cliente.setNombre(clienteActualizado.getNombre());
            if (clienteActualizado.getEmail() != null) cliente.setEmail(clienteActualizado.getEmail());
            if (clienteActualizado.getTelefono() != null) cliente.setTelefono(clienteActualizado.getTelefono());
            return cliente;
        } else {
            throw new RuntimeException("Cliente no encontrado");
        }
    }
}

