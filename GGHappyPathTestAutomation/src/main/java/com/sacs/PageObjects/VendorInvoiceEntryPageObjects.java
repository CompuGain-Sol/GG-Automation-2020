package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface VendorInvoiceEntryPageObjects {

	By invoiceedierrorsbutton=By.xpath("//a[contains(text(),'Invoice EDI Errors')]");
	By enterdocumnetbutton=By.xpath("//a[contains(text(),'Enter Document')]");
	By vendortextbox=By.id("Vendor");
	By vendordropdownmenuitem=By.xpath("(//*[@class='ui-menu-item'])[1]");
	By referencenumbertextbox=By.id("InvoiceNumber");
	By okbutton=By.id("submitInvoice");
	By invoicetextbox=By.id("Amount");
	By addpotoinvoicecheckbox=By.xpath("(//input[@name='selectPurchaseOrder']/../span)[1]");
	By addsecondpotoinvoicecheckbox=By.xpath("(//input[@name='selectPurchaseOrder']/../span)[2]");
	By continuebuttonforaddpotoinvoice=By.xpath("//*[@id='poSearch']//a[contains(text(),'Continue')]");
	By editbutton=By.xpath("//a[contains(text(),'Edit')]");
	By menu=By.xpath("//div[@class='extendedMenu']");
	By savebutton=By.xpath("//div[@class='IconSet']");
	By backbutton=By.xpath("//div[@class='backContainter fr']/a");
	By approvedvendorsearchtextbox=By.xpath("(//*[@class='slick-headerrow-columns slick-headerrow-columns-left']/div[4]/input)[2]");
	By missmatchvendornamesearchbox=By.xpath("//*[@class='slick-headerrow-columns slick-headerrow-columns-left']/div[3]/input");
	By vendorsearchresultgrid=By.xpath("//*[@class='ui-widget-content slick-row even']/div[4]");
	By vendorinvoiceeditbutton=By.xpath("//a[@class='icon-Edit action-showDetails infoLink tooltip']");
	By addpurchaseorderbutton=By.xpath("//a[contains(text(),'Add Purchase Order')]");
	By lineitemdifferencetext=By.xpath("//span[@id='summaryLineItemAmountDifference']");
	By okbuttonmissmatchvendorinvoices=By.xpath("//*[@id='potVendorInvoicesWrapper']/div[2]/div[2]/span[1]/a");
	By invoicecheckbox=By.xpath("//*[@id='checkSelBox00']");
	By invoicecheckbox2=By.xpath("//*[@id='checkSelBox10']");
	By createpostingreportforinvoicediasabledbutton=By.xpath("(//*[contains(text(),'Create Posting Report For Selected Invoices')])[1]");
	By createreportforpostinginvoicebutton=By.xpath("(//a[@class='bigbtnSkin action-postReport'])[1]");
	By oksuccessfullycreatedpopup=By.xpath("//*[@id='noInvoices']//a[contains(text(),'OK')]");
	By vendornamesearchboxfortransfervendorinvoice=By.xpath("//*[@class='slick-headerrow-columns slick-headerrow-columns-left']/div[3]/input");
	By transferslectedinvoicebutton=By.xpath("(//*[contains(text(),'Transfer Selected Invoices')])[1]");
	By postingdatetextbox=By.xpath("//input[@id='postingDate']");
	By postingdatecontinuebutton=By.xpath("//*[@id='transferInvoice']/div/a[contains(text(),'Continue')]");
	By confirmtransferyesbutton=By.xpath("//div[@id='transFormConfirm']//div/a[contains(text(),'Yes')]");
	By confirmtransfernobutton=By.xpath("//div[@id='transFormConfirm']//div/a[contains(text(),'No')]");
	By successfullycreatedtext=By.xpath("(//*[@class='k-window-titlebar k-header']/span)[3]");
	By invoicefilenametext=By.xpath("//*[@id='noInvoices']/div[@class='invoiceText']");
	By successfullcreatedpltpopupokbutton=By.xpath("//*[@id='noInvoices']/div[2]/a");
	By addcreditdebitvendorsearchtextbox=By.xpath("//*[@id='invoiceResults']/div[4]/div[1]/div[2]/div[3]/input");
	By addcreditdebitnotebutton=By.xpath("//*[@id='invoiceResults']/div[6]/div/div/div/div[7]/span/a");
	By addnewbutton=By.xpath("//*[@class='backContainter fr']/a[contains(text(),'Add New')]");
	By referencenumbertextboxaddcreditdebit=By.id("VendorNoteNumber");
	By invoiceamount=By.id("Amount");
	By documnetdate=By.id("InvoiceDate");
	By addcreditdebiteditbutton=By.id("EditOrder");
	By cndnqtybox=By.xpath("//*[@id='invoiceGrid']/div[6]/div/div/div[2]/div[10]");
	By cndnqtytextbox=By.xpath("//*[@id='invoiceGrid']/div[6]/div/div/div[2]/div[10]/input");
	By cndnpricebox=By.xpath("//*[@id='invoiceGrid']/div[6]/div/div/div[2]/div[11]");
	By cndnpricetextbox=By.xpath("//*[@id='invoiceGrid']/div[6]/div/div/div[2]/div[11]/input");
	By cndnnetamountbox=By.xpath("//*[@id='invoiceGrid']/div[6]/div/div/div[2]/div[12]");
	By debitbutton=By.xpath("//label[contains(text(),'Debit')]"); 
	By navigatebackbutton=By.xpath("//*[@id='subNav-finance']/span/sup");
	By vendorsearchtextbox=By.xpath("//div[@class='slick-headerrow-columns slick-headerrow-columns-left']/div[4]/input");
	By invoicedetailsbutton=By.xpath("(//a[@class='icon-Edit action-showDetails infoLink tooltip'])[1]");
	By additionalcostsbutton=By.xpath("(//div[@class='IconSet iconPos'])[1]");
	By addlinebutton=By.xpath("//a[contains(text(),'Add Line')]");
	By costpricebox=By.xpath("//div[@id='invoiceResults']/div[6]/div/div/div/div[1]");
	By costpricedropdown=By.xpath("//div[@id='invoiceResults']/div[6]/div/div/div/div[1]/select");
	By netamountbox=By.xpath("//div[@id='invoiceResults']/div[6]/div/div/div/div[6]");
	By netamounttextbox=By.xpath("//div[@id='invoiceResults']/div[6]/div/div/div/div[6]/input");
	By addCreditDebitNotebuttonInvoiceEntrypage=By.xpath("//button[@id='addCreditDebitNote']");
}
 