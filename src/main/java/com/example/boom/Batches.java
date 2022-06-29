//package com.example.boom;
//
//import org.springframework.data.annotation.Id;
//
//import com.azure.spring.data.cosmos.core.mapping.Container;
//import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
//
//@Container(containerName = "batchData")
//public class Batches {
//
//	  @Id
//	    @PartitionKey
//	    private String scheduledBatch;
//	    private String date;
//	    private String startTime;
//	    private String threshold;
//	    private String user;
//	    private String notes;
//
//	    public Batches() {
//
//	    }
//
//
//		public Batches(String scheduledBatch, String date, String startTime, String threshold, String user,
//				String notes) {
//			this.scheduledBatch = scheduledBatch;
//			this.date = date;
//			this.startTime = startTime;
//			this.threshold = threshold;
//			this.user = user;
//			this.notes = notes;
//		}
//
//		public String getScheduledBatch() {
//			return scheduledBatch;
//		}
//
//		public void setScheduledBatch(String scheduledBatch) {
//			this.scheduledBatch = scheduledBatch;
//		}
//
//		public String getDate() {
//			return date;
//		}
//
//		public void setDate(String date) {
//			this.date = date;
//		}
//
//		public String getStartTime() {
//			return startTime;
//		}
//
//		public void setStartTime(String startTime) {
//			this.startTime = startTime;
//		}
//
//		public String getThreshold() {
//			return threshold;
//		}
//
//		public void setThreshold(String threshold) {
//			this.threshold = threshold;
//		}
//
//		public String getUser() {
//			return user;
//		}
//
//		public void setUser(String user) {
//			this.user = user;
//		}
//
//		public String getNotes() {
//			return notes;
//		}
//
//		public void setNotes(String notes) {
//			this.notes = notes;
//		}
//
//		@Override
//	    public String toString() {
//	        return "Batches [scheduledBatch=" + scheduledBatch + ", date=" + date + ", startTime=" + startTime + ", threshold=" + threshold + " , user=" + user + ",notes= "+ notes+"]";
//	    }
//}
