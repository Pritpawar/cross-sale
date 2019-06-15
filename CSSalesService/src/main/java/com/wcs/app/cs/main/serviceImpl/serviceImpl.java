package com.wcs.app.cs.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.dialect.InnoDBStorageEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wcs.app.cs.main.model.BranchProductStock;
import com.wcs.app.cs.main.model.BranchProductTarget;
import com.wcs.app.cs.main.model.BranchProductTargetQuantity;
import com.wcs.app.cs.main.model.Invoice;
import com.wcs.app.cs.main.model.InvoiceProductWiseQuantity;
import com.wcs.app.cs.main.model.ProductPriceMapping;
import com.wcs.app.cs.main.repository.IBranchProductStockRepository;
import com.wcs.app.cs.main.repository.IBranchProductTargetRepository;
import com.wcs.app.cs.main.repository.IInvoiceRepository;
import com.wcs.app.cs.main.repository.IProductPriceMappingRepository;
import com.wcs.app.cs.main.service.Iservice;

@Service
public class serviceImpl implements Iservice {

	@Autowired
	IInvoiceRepository invoicerepository;

	@Autowired
	IBranchProductTargetRepository brproducttargetrepository;
	
	@Autowired
	IBranchProductStockRepository branchproductstock;

	List l = new ArrayList();

	@Override
	public List<BranchProductStock> getBranchProductStock() {
		
		return (List<BranchProductStock>) branchproductstock.findAll();
	}
	
	@Override
	public List getinvoiceproductstock() {

		List<Invoice> invoicelist = invoicerepository.findAll();
		List<BranchProductTarget> brprodtarlist = brproducttargetrepository.findAll();
		for (Invoice invoice : invoicelist) {

			String branchname = invoice.getBranchInformation().getBranchName();
			for (BranchProductTarget brprodtarget : brprodtarlist) {
				String branchname2 = brprodtarget.getBranchInformation().getBranchName();
				if (branchname == branchname2) {
					l.add(branchname);

					Set<ProductPriceMapping> ppm = invoice.getProductQuantity().keySet();
					System.out.println("set of prodprice mapping of invoice---" + ppm);
					for (ProductPriceMapping pr : ppm) {
						String productname = pr.getProductInformation().getProductName();
						System.out.println(productname);
						Set<ProductPriceMapping> ppm1 = brprodtarget.getPmap().keySet();
						System.out.println("set of prodprice mapping of branchproducttarget----" + ppm1);
						for (ProductPriceMapping pr1 : ppm1) {
							String productname1 = pr1.getProductInformation().getProductName();
							if (productname.equals(productname1)) {
								l.add(productname1);
								InvoiceProductWiseQuantity ipwq = invoice.getProductQuantity().get(pr);
								BranchProductTargetQuantity bptq = brprodtarget.getPmap().get(pr1);
								int invoicewiseprodquantity = ipwq.getInvoiceproductwisequantity();
								int branchinitialquantity = bptq.getInitialTargetQuantity();
								l.add(invoicewiseprodquantity);
								l.add(branchinitialquantity); // l.add(ipwq);
								// l.add(bptq);

							}
						}

					}

				}
			}

		}
		return l;
	}



	

	/*
	 * @Override public List<Invoice> getinvoiceproductstock() { List<Invoice>
	 * invoicelist = invoicerepository.findAll();
	 * 
	 * for (Invoice invoice : invoicelist) {
	 * 
	 * String branchname = invoice.getBranchInformation().getBranchName();
	 * l.add(branchname); Set<ProductPriceMapping> ppm =
	 * invoice.getProductQuantity().keySet();
	 * System.out.println("set of product price mapping---" + ppm); for
	 * (ProductPriceMapping pr : ppm) { String productname =
	 * pr.getProductInformation().getProductName(); System.out.println(productname);
	 * 
	 * l.add(productname);
	 * 
	 * InvoiceProductWiseQuantity ipwq = invoice.getProductQuantity().get(pr);
	 * l.add(ipwq.getInvoiceproductwisequantity()); } } return l;
	 */

}

/*
 * BranchProductTarget target = new BranchProductTarget(); BranchProductTarget
 * brproducttargetlist = (BranchProductTarget)
 * brproducttargetrepository.findAll();
 * 
 * for(BranchProductTarget bpr:brproducttargetlist) {
 * 
 * } branchnameOfbrprodtarget=bpr.getBranchInformation().getBranchName();
 * 
 * System.out.println("BranchNameOf brprodtarget-----"+branchnameOfbrprodtarget)
 * ;
 * 
 * Set<ProductPriceMapping> ppm1=bpr.getPmap().keySet();
 * System.out.println(ppm1); for(ProductPriceMapping pr1: ppm1) { String
 * productname1=pr1.getProductInformation().getProductName();
 * System.out.println(productname1);
 * 
 * BranchProductTargetQuantity bptq=bpr.getPmap().get(pr1); int
 * BranchProdQty=bptq.getInitialTargetQuantity();
 * 
 * }
 */

//rohan------------
/*
 * @Override public List<Invoice> getinvoiceproductstock() { List
 * invoicelist=(List)invoicerepository.findAll(); return invoicelist; }
 */

///// YASH LOGIC/////
/*
 * @Override public int getProductnameByBranchName(String productName, String
 * branchName) {
 * Map<ProductPriceMapping,InvoiceProductWiseQuantity>productquantityMap=null;
 * List<Invoice> invoicelist=invoicerepository.findAll();
 * InvoiceProductWiseQuantity ipwq=null; int i=0; List<Invoice> templist=new
 * ArrayList<Invoice>(); for(Invoice invoice:invoicelist) {
 * productquantityMap=invoice.getProductQuantity(); Set<ProductPriceMapping>
 * keys=productquantityMap.keySet();
 * 
 * for(ProductPriceMapping key:keys) { ProductPriceMapping ppm=key;
 * InvoiceProductWiseQuantity quantity=productquantityMap.get(key);
 * i=quantity.getInvoiceproductwisequantity();
 * if(ppm.getProductInformation().getProductName().equals(productName) &&
 * invoice.getBranchInformation().getBranchName().equals(branchName)) { return
 * 0; } } } return i; }
 */
