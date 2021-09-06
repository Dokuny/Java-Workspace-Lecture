package monopoly.model;

import java.util.*;

public class City {

	private String owner =null;
	private String name; // 도시이름 
	



	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	//건물이 지어져있는지
	
	private boolean land = false;
	private boolean building = false;
	private boolean hotel = false;
	private boolean landmark = false;
	
	//건설비용
	private int landPrice =0; //땅값
	private int buildingPrice = (int)(landPrice/0.9);
	private int hotelPrice = (int)(landPrice*2.0); //호텔가격  3.0
	private int landmarkPrice = (int)(landPrice*2);
	
	//통행료
	private int landTall=0; 
	private int buildingTall = (int)(landTall*2);
	private int hotelTall = (int)(landTall*1.5);
	private int landmarkTall = (int)(landTall*2.0);

	
	//인수비용
	private int landCost = landPrice*2; 
	private int buildingCost = buildingPrice*2;
	private int hotelCost = hotelPrice*2;
	private int landmarkCost = landmarkPrice*2;
	
	//매각비용
	private int landSell = landPrice/2;
	private int buildingSell = buildingPrice/2;
	private int hotelSell = hotelPrice/2;
	private int landmarkSell = landmarkPrice/2;
	
	
	
	//도시 생성자(매개변수에 도시별 이름 가격 넣기)
	public City(String name, int landPrice, int landTall) {
		this.name = name;
		this.landPrice = landPrice;
		this.landTall = landTall;
	}
	
	public boolean isBuilding() {
		return building;
	}


	public void setBuilding(boolean building) {
		this.building = building;
	}


	public int getBuildingPrice() {
		return buildingPrice;
	}


	public void setBuildingPrice(int buildingPrice) {
		this.buildingPrice = buildingPrice;
	}


	public int getBuildingTall() {
		return buildingTall;
	}


	public void setBuildingTall(int buildingTall) {
		this.buildingTall = buildingTall;
	}


	public int getBuildingCost() {
		return buildingCost;
	}


	public void setBuildingCost(int buildingCost) {
		this.buildingCost = buildingCost;
	}


	public int getBuildingSell() {
		return buildingSell;
	}


	public void setBuildingSell(int buildingSell) {
		this.buildingSell = buildingSell;
	}


	public void ownedCityInfo() {
		
	}
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isLand() {
		return land;
	}



	public void setLand(boolean land) {
		this.land = land;
	}



	public boolean isHotel() {
		return hotel;
	}



	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}



	public boolean isLandmark() {
		return landmark;
	}



	public void setLandmark(boolean landmark) {
		this.landmark = landmark;
	}



	public int getLandPrice() {
		return landPrice;
	}



	public void setLandPrice(int landPrice) {
		this.landPrice = landPrice;
	}



	public int getHotelPrice() {
		return hotelPrice;
	}



	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}



	public int getLandmarkPrice() {
		return landmarkPrice;
	}



	public void setLandmarkPrice(int landmarkPrice) {
		this.landmarkPrice = landmarkPrice;
	}



	public int getLandTall() {
		return landTall;
	}



	public void setLandTall(int landTall) {
		this.landTall = landTall;
	}



	public int getHotelTall() {
		return hotelTall;
	}



	public void setHotelTall(int hotelTall) {
		this.hotelTall = hotelTall;
	}



	public int getLandmarkTall() {
		return landmarkTall;
	}



	public void setLandmarkTall(int landmarkTall) {
		this.landmarkTall = landmarkTall;
	}



	public int getLandCost() {
		return landCost;
	}



	public void setLandCost(int landCost) {
		this.landCost = landCost;
	}



	public int getHotelCost() {
		return hotelCost;
	}



	public void setHotelCost(int hotelCost) {
		this.hotelCost = hotelCost;
	}



	public int getLandmarkCost() {
		return landmarkCost;
	}



	public void setLandmarkCost(int landmarkCost) {
		this.landmarkCost = landmarkCost;
	}



	public int getLandSell() {
		return landSell;
	}



	public void setLandSell(int landSell) {
		this.landSell = landSell;
	}



	public int getHotelSell() {
		return hotelSell;
	}



	public void setHotelSell(int hotelSell) {
		this.hotelSell = hotelSell;
	}



	public int getLandmarkSell() {
		return landmarkSell;
	}



	public void setLandmarkSell(int landmarkSell) {
		this.landmarkSell = landmarkSell;
	}
	
	
	
	
	
}
