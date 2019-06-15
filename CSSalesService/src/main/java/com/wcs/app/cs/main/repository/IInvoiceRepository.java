package com.wcs.app.cs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.app.cs.main.model.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, String>{

}
