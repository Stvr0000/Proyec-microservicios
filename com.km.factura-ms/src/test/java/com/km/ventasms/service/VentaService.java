package com.km.ventasms.service;

import com.km.ventasms.model.venta;
import com.km.ventasms.repository.VentaRepository;
import com.km.cliente-ms.model.Cliente;
import com.km.cliente-ms.repository.ClienteRepository;
import com.km.producto-ms.model.Producto;
import com.km.producto-ms.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Venta getVentaById(Long id) {
        return ventaRepository.findById(id).orElseThrow();
    }

    public Venta crearVenta(Venta venta) {
        // Validar existencia del cliente y producto
        Cliente cliente = clienteRepository.findById(venta.getCliente().getId()).orElseThrow();
        Producto producto = productoRepository.findById(venta.getProducto().getId()).orElseThrow();

        venta.setCliente(cliente);
        venta.setProducto(producto);

        return ventaRepository.save(venta);
    }

    public Venta actualizarVenta(Venta venta) {
        // Validar existencia del cliente y producto
        Cliente cliente = clienteRepository.findById(venta.getCliente().getId()).orElseThrow();
        Producto producto = productoRepository.findById(venta.getProducto().getId()).orElseThrow();

        venta.setCliente(cliente);
        venta.setProducto(producto);

        return ventaRepository.save(venta);
    }

    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
}
