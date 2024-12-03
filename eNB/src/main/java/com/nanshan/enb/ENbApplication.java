package com.nanshan.enb;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nanshan.enb.dao.OwnerDAO;
import com.nanshan.enb.dao.PolicyDAO;
import com.nanshan.enb.util.ENBConfigUtil;

@SpringBootApplication
public class ENbApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ENbApplication.class, args);
	}
	
	@Autowired
	PolicyDAO policyDAO;
	
	@Autowired
	OwnerDAO ownerDAO;
	
	@Autowired
	ENBConfigUtil enbUtil;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(enbUtil.getApplicationName());
		
		//System.out.println(EnumUtils.getAllEnumsInPackage("com.nanshan.enb.enums"));;
	}
	
	private static String generateRandomPolicyNo() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);

        // 生成第一位字符 'A' 或 'U'
        char firstChar = random.nextBoolean() ? 'A' : 'U';
        sb.append(firstChar);

        // 生成接下来的9位数字
        for (int i = 1; i < 10; i++) {
            int digit = random.nextInt(10); // 生成0到9的随机数字
            sb.append(digit);
        }

        return sb.toString();
    }
	
	private static String generateTaiwanID() {
        Random random = new Random();

        // 生成第一位字母（A-Z）
        char letter = (char) ('A' + random.nextInt(26));

        // 生成后九位数字
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            digits.append(random.nextInt(10));
        }

        return letter + digits.toString();
    }

}
