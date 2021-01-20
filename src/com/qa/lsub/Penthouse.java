package com.qa.lsub;

public class Penthouse extends MoreBedroom {
	

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(this.getSquareFootage());
    }

	@Override
	public void moreBedroom() {
		// TODO Auto-generated method stub
		this.setNumberOfBedrooms(4);
		
	}

}
