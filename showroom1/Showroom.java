package com.xworkz.showroom1;

	public class Showroom implements Cloneable{
		private String showRoom;
		private String location;
		public String getShowRoom() {
			return showRoom;
		}
		public void setShowRoom(String showRoom) {
			this.showRoom = showRoom;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

	}


