/**
 * 
 */
package com.ektha.quote.nameandadress.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.ektha.quote.nameandadress.exception.NameAddressNotFoundException;
import com.ektha.quote.nameandadress.model.MailingInfo;
import com.ektha.quote.nameandadress.model.NameAndAddress;

/**
 * @author AsimSubedi
 *
 */
@Repository
public class NameAddressDAOV1 implements InitializingBean {

	private static List<NameAndAddress> store = new ArrayList<NameAndAddress>();

	private static final String DATA_FILE_PATH = "datafilepath";

	/**
	 * Thsi method is adding name and Address
	 * 
	 * @param nameAndAddress
	 * @return
	 */
	public NameAndAddress addNameAndAddress(NameAndAddress nameAndAddress) {

		nameAndAddress.setId(UUID.randomUUID().toString());
		store.add(nameAndAddress);

		return nameAndAddress;
	}

	/**
	 * This method is updating nameand address
	 * 
	 * @param Id
	 * @param nameAndAddress
	 * @return
	 */
	public NameAndAddress updateNameAndAddress(String Id, NameAndAddress nameAndAddress) {

		for (int index = 0; index < store.size(); index++) {

			NameAndAddress nmd = store.get(index);

			if (nmd.getId().equals(Id)) {

				return store.set(index, nameAndAddress);

			}
		}

		return null;

	}

	/**
	 * This method is fetching NameAndAddress Object based on id.
	 * 
	 * @param id
	 * @return NameandAddress Object
	 */
	public NameAndAddress fetchNameAddress(String id) {
		for (int index = 0; index < store.size(); index++) {

			NameAndAddress nmd = store.get(index);

			if (nmd.getId().equals(id)) {

				return nmd;

			}
		}

		throw new NameAddressNotFoundException();
	}

	/**
	 * @param id
	 * @return true if deleted
	 */
	public boolean deleteNameAddress(String id) {

		for (int index = 0; index < store.size(); index++) {
			NameAndAddress nmd = store.get(index);

			if (nmd.getId().equals(id)) {
				store.remove(index);
				return true;
			}
		}

		return false;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		String filePath = System.getProperty(DATA_FILE_PATH);
		
		System.out.println("== File path" + filePath);

		BufferedReader bfr = new BufferedReader(new FileReader(filePath));

		//StringBuilder strBuilder = new StringBuilder("");

		String line = "";
		
		while((line = bfr.readLine()) != null ) {
			
			String[] tokens = line.split(",");
			NameAndAddress nmd = new NameAndAddress();
			nmd.setFirstName(tokens[0]);
			nmd.setLastName(tokens[1]);
			nmd.setDob(tokens[2]);
			
			MailingInfo mailInfo = new MailingInfo();
			mailInfo.setStreet(tokens[3]);
			mailInfo.setCity(tokens[4]);
			mailInfo.setState(tokens[5]);
			mailInfo.setZip(tokens[6]);
			
			nmd.setMailingInfo(mailInfo);
			
			addNameAndAddress(nmd);
						
		}
		bfr.close();

	}

	public List<NameAndAddress> fetchAllNameAddress() {
		return store;
	}

}
