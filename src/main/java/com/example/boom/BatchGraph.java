package com.example.boom;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "batchGraph")
public class BatchGraph {
	
	
	@Id
    @PartitionKey
    private String subs;
	private String billingAccounts;
	
	public BatchGraph() {}
	public BatchGraph(String subs, String billingAccounts) {
	
		this.subs = subs;
		this.billingAccounts = billingAccounts;
	}
	public String getSubs() {
		return subs;
	}
	public void setSubs(String subs) {
		this.subs = subs;
	}
	public String getBillingAccounts() {
		return billingAccounts;
	}
	public void setBillingAccounts(String billingAccounts) {
		this.billingAccounts = billingAccounts;
	}
	
	
	
	

}
