package com.sacs.beanfactory;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;

import com.sacs.Reportinglib.DateTime;
import com.sacs.dao.AddCreditDebitNoteBeanPage;
import com.sacs.dao.BasicArticlesBeanPage;
import com.sacs.dao.DeliveryPlanBeanPage;
import com.sacs.dao.VendorBeanPage;
import com.sacs.funUtils.SACSSetup;

public class BeanFactory implements SACSSetup{
	private static Logger logger = Logger.getLogger(BeanFactory.class);
	public int customerIndex=0;
	
	
	public void createVendorBeans(VendorBeanPage vendorbeans) {
		
		String vendorname="VENDOR_"+RandomStringUtils.randomNumeric(5);
		String vendorsapnumber=RandomStringUtils.randomNumeric(8);
		
		vendorbeans.setVendorname(vendorname);
		vendorbeans.setSapvendornumber(vendorsapnumber);
	}
	
	public void createBasicArticle(BasicArticlesBeanPage basicArticlesBeanPage) {
		String localdescription="B ARTICLE "+RandomStringUtils.randomNumeric(5);
		String articlegroup="O01-AIR EQUIP ROTABLE";
		String financeaccountgroup="330000-Non-valuated Mat";
		String articlenumber=RandomStringUtils.randomNumeric(6);
		
		basicArticlesBeanPage.setLocaldescription(localdescription);
		basicArticlesBeanPage.setDayprice("100");
		basicArticlesBeanPage.setArticlegroup(articlegroup);
		basicArticlesBeanPage.setFinanceaccountgroup(financeaccountgroup);
		basicArticlesBeanPage.setArticlenumber(articlenumber);
	}
	
	
	public void selectCustomerCode(DeliveryPlanBeanPage deliveryPlanBeanPage ) {
		String aircanada= "AC - Air Canada";
		String airfrance="AF - Air France";
		
	}
	
	public void getArticleFromPurchaseOrderRegistration() {
		
	}
		
	public void addCreditDebitNote(AddCreditDebitNoteBeanPage addCreditDebitNoteBeanPage) {
		String referencenumber="R_No "+RandomStringUtils.randomNumeric(5);
		String invoiceamount="10000";
		String documentdate=DateTime.getTodayDate();
		addCreditDebitNoteBeanPage.setReferencenumber(referencenumber);
		addCreditDebitNoteBeanPage.setInvoiceamount(invoiceamount);
		addCreditDebitNoteBeanPage.setDocumentdate(documentdate);
	}
	

}
