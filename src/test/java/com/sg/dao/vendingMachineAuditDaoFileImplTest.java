/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.sg.dao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author stwal
 */
public class vendingMachineAuditDaoFileImplTest {  //Not sure how to use - do i need to write methods to test? to read from file
    String testAuditFile = "testAuditFile.txt";
    vendingMachineAuditDao testAuditDao = new vendingMachineAuditDaoFileImpl(testAuditFile);
    
    
    public vendingMachineAuditDaoFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testWriteAuditEntry() throws vendingMachinePersistenceException {
        //ARRANGE
        String entry = "One Snickers removed.";
        
        //ACT
        testAuditDao.writeAuditEntry(entry);
        
    }
    
}