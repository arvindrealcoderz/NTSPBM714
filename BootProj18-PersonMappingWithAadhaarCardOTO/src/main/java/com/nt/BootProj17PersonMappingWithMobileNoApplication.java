package com.nt;

import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Aadhaar;
import com.nt.entity.Address;
import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IPerson;

@SpringBootApplication
public class BootProj17PersonMappingWithMobileNoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj17PersonMappingWithMobileNoApplication.class, args);
		IPerson service= ctx.getBean("personImpl",IPerson.class);
		
		Person person=new Person();
		person.setName("Arvind ");
		Address addr=new Address();
		//addr.setStNo(1);
		addr.setCityName("Hyd");
		
		PhoneNumber phone=new PhoneNumber();
		phone.setPhoneNo(7238959262l);

		Aadhaar aadhaar=new Aadhaar();
		aadhaar.setAadhaar_no(559457743723l);
		person.setAddress(addr);
		person.setPhone_id(phone);
		person.setAddhar_card_no(aadhaar);;
		System.out.println(service.Save(person));
		
		}

}
