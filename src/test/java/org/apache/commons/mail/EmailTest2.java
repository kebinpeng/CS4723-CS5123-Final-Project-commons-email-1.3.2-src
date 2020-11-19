package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class EmailTest2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	@Test
	public void test_addReplyTo() throws EmailException {
		System.out.println("This is a message from the HKY test.");
		testEmail.addReplyTo("a@b.com","tom");
		assertEquals("tom <a@b.com>", testEmail.getReplyToAddresses().get(0).toString());
	}

}

        
