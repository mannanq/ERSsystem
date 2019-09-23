// tests
package com.revature.daos;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.revature.models.Receipts;


public class ReceiptServiceImplTest {
	
	@InjectMocks
	
	ReceiptsDao test = new ReceiptDaoImpl();
	
	@Mock
	ReceiptDaoImpl ReceiptsDao;
	
	@Before
	public void setup() throws FileNotFoundException, SQLException {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCreateReceipt() {
		Receipts receipt = new Receipts(100, "new receipt", 4);
		
		when(ReceiptsDao.createReceipt(receipt)).thenReturn(1);
		assertEquals(1, test.createReceipt(receipt));
		
	}
	
	@Test
	public void testGetRequestByEmployeeId() {
		
		List<Receipts> receiptsList = new ArrayList<>();
		receiptsList.add(new Receipts(100, "new receipt", 4));
		
		
		//Receipts receipt = new Receipts(100, 4, "new receipt 2");
		
		when(ReceiptsDao.getReceiptsByEmployeeId(4)).thenReturn(receiptsList);
		assertEquals(receiptsList, test.getReceiptsByEmployeeId(4));
	}
	
	@Test
	public void testGetRequests() {
		
		
		List<Receipts> receiptList = new ArrayList<>();
		
		receiptList.add(new Receipts(100, "new receipt", 4));
		
		when(ReceiptsDao.getReceipts()).thenReturn(receiptList);
		assertEquals(receiptList, test.getReceipts());
	}
	
}
