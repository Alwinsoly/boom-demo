package com.example.boomnew;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "batchGraph")
public class BatchGraph {
	
	
	@Id
    @PartitionKey
    private String softDisconnect;
	private String detaProvisioning;
	
	public BatchGraph() {}

	public BatchGraph(String softDisconnect, String detaProvisioning) {
		
		this.softDisconnect = softDisconnect;
		this.detaProvisioning = detaProvisioning;
	}

	public String getSoftDisconnect() {
		return softDisconnect;
	}

	public void setSoftDisconnect(String softDisconnect) {
		this.softDisconnect = softDisconnect;
	}

	public String getDetaProvisioning() {
		return detaProvisioning;
	}

	public void setDetaProvisioning(String detaProvisioning) {
		this.detaProvisioning = detaProvisioning;
	}
	
	
	

}
