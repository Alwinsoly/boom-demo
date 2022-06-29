package com.example.boom;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "batchData")
public class Test {
	
	 @Id
	    @PartitionKey
	    private String dom;
	    private String deltaBatch;
	    private String process;
	    private String status;
	    private String batchNumber;
	    private String batchCount;
	    private String success;
	    private String failed;
	    
	    public Test() {
	    	
	    }
		public Test(String dom, String deltaBatch, String process, String status, String batchNumber,
				String batchCount, String success, String failed) {
			
			this.dom = dom;
			this.deltaBatch = deltaBatch;
			this.process = process;
			this.status = status;
			this.batchNumber = batchNumber;
			this.batchCount = batchCount;
			this.success = success;
			this.failed = failed;
		}
		public String getDom() {
			return dom;
		}
		public void setDom(String dom) {
			this.dom = dom;
		}
		public String getDeltaBatch() {
			return deltaBatch;
		}
		public void setDeltaBatch(String deltaBatch) {
			this.deltaBatch = deltaBatch;
		}
		public String getProcess() {
			return process;
		}
		public void setProcess(String process) {
			this.process = process;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
		}
		public String getBatchCount() {
			return batchCount;
		}
		public void setBatchCount(String batchCount) {
			this.batchCount = batchCount;
		}
		public String getSuccess() {
			return success;
		}
		public void setSuccess(String success) {
			this.success = success;
		}
		public String getFailed() {
			return failed;
		}
		public void setFailed(String failed) {
			this.failed = failed;
		}
		
		
	    
	    
	    
	

}
