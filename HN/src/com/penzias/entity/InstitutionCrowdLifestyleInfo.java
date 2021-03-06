package com.penzias.entity;

public class InstitutionCrowdLifestyleInfo {

	private Integer lifestyleid;

	private Integer crowdid;

	// 吸烟情况（ZN）
	private String smoke;

	// 年限
	private String smokeyear;

	// 每天支数
	private String smokeday;

	// 喝酒情况（ZO）
	private String wine;

	// 年限
	private String wineyear;

	// 运动情况（ZP）
	private String sports;

	private String sportsyear;

	// 膳食习惯（ZQ）
	//膳食习惯_口味（CodeID=ZQ  Code=01下的选项）
	private String dietflavor;

	//年限
	private String dietflavoryear;

	//膳食习惯_荤素（CodeID=ZQ  Code=02下的选项）
	private String dietmeatvegetables;

	//年限
	private String dietmeatvegetablesyear;

	//膳食习惯_吃蔬菜（CodeID=ZQ  Code=03下的选项）
	private String dietvegetables;

	//年限
	private String dietvegetablesyear;

	//膳食习惯_吃水果（CodeID=ZQ  Code=04下的选项）
	private String dietfruits;

	//年限
	private String dietfruitsyear;

	//膳食习惯_牛奶或酸奶（CodeID=ZQ  Code=05下的选项）
	private String dietmilk;

	//年限
	private String dietmilkyear;

	private String flag;

	// 不参与映射的属性
	// 是否吸烟
	private String isSmokeFlag;

	// 是否被动吸烟
	private String isSecondSmokenFlag;

	// 被动吸烟年限
	private String secondSmokenYear;

	// 吸烟年限
	private String smokingYear;

	// 是否戒烟
	private String isDontSmokeFlag;

	// 戒烟年限
	private String dontSmokeYear;

	// 曾经吸烟多少年
	private String smokenYear;

	// 少量饮酒量年限
	private String littleDrinkMountYear;

	// 大量饮酒量年限
	private String lotDrinkMountYear;

	// 运动年限
	private String hasSportYear;

	// 缺乏运动年限
	private String hasNoSportYear;

	// 口味
	private String eatStyle;

	// 其他口味年限
	private String eatStyleOtherYear;

	// 口味
	private String meatStyle;

	// 其他口味年限
	private String meatStyleOtherYear;

	// 口味
	private String vagStyle;

	// 其他口味年限
	private String vagStyleOtherYear;

	// 口味
	private String fruitStyle;

	// 其他口味年限
	private String fruitStyleOtherYear;

	// 口味
	private String milkStyle;

	// 其他口味年限
	private String milkStyleOtherYear;

	public Integer getLifestyleid(){

		return lifestyleid;
	}

	public void setLifestyleid(Integer lifestyleid){

		this.lifestyleid = lifestyleid;
	}

	public Integer getCrowdid(){

		return crowdid;
	}

	public void setCrowdid(Integer crowdid){

		this.crowdid = crowdid;
	}

	public String getSmoke(){

		return smoke;
	}

	public void setSmoke(String smoke){

		this.smoke = smoke;
	}

	public String getSmokeyear(){

		return smokeyear;
	}

	public void setSmokeyear(String smokeyear){

		this.smokeyear = smokeyear;
	}

	public String getSmokeday(){

		return smokeday;
	}

	public void setSmokeday(String smokeday){

		this.smokeday = smokeday;
	}

	public String getWine(){

		return wine;
	}

	public void setWine(String wine){

		this.wine = wine;
	}

	public String getWineyear(){

		return wineyear;
	}

	public void setWineyear(String wineyear){

		this.wineyear = wineyear;
	}

	public String getSports(){

		return sports;
	}

	public void setSports(String sports){

		this.sports = sports;
	}

	public String getSportsyear(){

		return sportsyear;
	}

	public void setSportsyear(String sportsyear){

		this.sportsyear = sportsyear;
	}

	public String getFlag(){

		return flag;
	}

	public void setFlag(String flag){

		this.flag = flag;
	}

	public String getIsSmokeFlag(){

		return isSmokeFlag;
	}

	public void setIsSmokeFlag(String isSmokeFlag){

		this.isSmokeFlag = isSmokeFlag;
	}

	public String getIsSecondSmokenFlag(){

		return isSecondSmokenFlag;
	}

	public void setIsSecondSmokenFlag(String isSecondSmokenFlag){

		this.isSecondSmokenFlag = isSecondSmokenFlag;
	}

	public String getSecondSmokenYear(){

		return secondSmokenYear;
	}

	public void setSecondSmokenYear(String secondSmokenYear){

		this.secondSmokenYear = secondSmokenYear;
	}

	public String getSmokingYear(){

		return smokingYear;
	}

	public void setSmokingYear(String smokingYear){

		this.smokingYear = smokingYear;
	}

	public String getIsDontSmokeFlag(){

		return isDontSmokeFlag;
	}

	public void setIsDontSmokeFlag(String isDontSmokeFlag){

		this.isDontSmokeFlag = isDontSmokeFlag;
	}

	public String getDontSmokeYear(){

		return dontSmokeYear;
	}

	public void setDontSmokeYear(String dontSmokeYear){

		this.dontSmokeYear = dontSmokeYear;
	}

	public String getSmokenYear(){

		return smokenYear;
	}

	public void setSmokenYear(String smokenYear){

		this.smokenYear = smokenYear;
	}

	public String getLittleDrinkMountYear(){

		return littleDrinkMountYear;
	}

	public void setLittleDrinkMountYear(String littleDrinkMountYear){

		this.littleDrinkMountYear = littleDrinkMountYear;
	}

	public String getLotDrinkMountYear(){

		return lotDrinkMountYear;
	}

	public void setLotDrinkMountYear(String lotDrinkMountYear){

		this.lotDrinkMountYear = lotDrinkMountYear;
	}

	public String getHasSportYear(){

		return hasSportYear;
	}

	public void setHasSportYear(String hasSportYear){

		this.hasSportYear = hasSportYear;
	}

	public String getHasNoSportYear(){

		return hasNoSportYear;
	}

	public void setHasNoSportYear(String hasNoSportYear){

		this.hasNoSportYear = hasNoSportYear;
	}

	public String getEatStyle(){

		return eatStyle;
	}

	public void setEatStyle(String eatStyle){

		this.eatStyle = eatStyle;
	}

	public String getEatStyleOtherYear(){

		return eatStyleOtherYear;
	}

	public void setEatStyleOtherYear(String eatStyleOtherYear){

		this.eatStyleOtherYear = eatStyleOtherYear;
	}

	public String getMeatStyle(){

		return meatStyle;
	}

	public void setMeatStyle(String meatStyle){

		this.meatStyle = meatStyle;
	}

	public String getMeatStyleOtherYear(){

		return meatStyleOtherYear;
	}

	public void setMeatStyleOtherYear(String meatStyleOtherYear){

		this.meatStyleOtherYear = meatStyleOtherYear;
	}

	public String getVagStyle(){

		return vagStyle;
	}

	public void setVagStyle(String vagStyle){

		this.vagStyle = vagStyle;
	}

	public String getVagStyleOtherYear(){

		return vagStyleOtherYear;
	}

	public void setVagStyleOtherYear(String vagStyleOtherYear){

		this.vagStyleOtherYear = vagStyleOtherYear;
	}

	public String getFruitStyle(){

		return fruitStyle;
	}

	public void setFruitStyle(String fruitStyle){

		this.fruitStyle = fruitStyle;
	}

	public String getFruitStyleOtherYear(){

		return fruitStyleOtherYear;
	}

	public void setFruitStyleOtherYear(String fruitStyleOtherYear){

		this.fruitStyleOtherYear = fruitStyleOtherYear;
	}

	public String getMilkStyle(){

		return milkStyle;
	}

	public void setMilkStyle(String milkStyle){

		this.milkStyle = milkStyle;
	}

	public String getMilkStyleOtherYear(){

		return milkStyleOtherYear;
	}

	public void setMilkStyleOtherYear(String milkStyleOtherYear){

		this.milkStyleOtherYear = milkStyleOtherYear;
	}

	public String getDietflavor(){

		return dietflavor;
	}

	public void setDietflavor(String dietflavor){

		this.dietflavor = dietflavor;
	}

	public String getDietflavoryear(){

		return dietflavoryear;
	}

	public void setDietflavoryear(String dietflavoryear){

		this.dietflavoryear = dietflavoryear;
	}

	public String getDietmeatvegetables(){

		return dietmeatvegetables;
	}

	public void setDietmeatvegetables(String dietmeatvegetables){

		this.dietmeatvegetables = dietmeatvegetables;
	}

	public String getDietmeatvegetablesyear(){

		return dietmeatvegetablesyear;
	}

	public void setDietmeatvegetablesyear(String dietmeatvegetablesyear){

		this.dietmeatvegetablesyear = dietmeatvegetablesyear;
	}

	public String getDietvegetables(){

		return dietvegetables;
	}

	public void setDietvegetables(String dietvegetables){

		this.dietvegetables = dietvegetables;
	}

	public String getDietvegetablesyear(){

		return dietvegetablesyear;
	}

	public void setDietvegetablesyear(String dietvegetablesyear){

		this.dietvegetablesyear = dietvegetablesyear;
	}

	public String getDietfruits(){

		return dietfruits;
	}

	public void setDietfruits(String dietfruits){

		this.dietfruits = dietfruits;
	}

	public String getDietfruitsyear(){

		return dietfruitsyear;
	}

	public void setDietfruitsyear(String dietfruitsyear){

		this.dietfruitsyear = dietfruitsyear;
	}

	public String getDietmilk(){

		return dietmilk;
	}

	public void setDietmilk(String dietmilk){

		this.dietmilk = dietmilk;
	}

	public String getDietmilkyear(){

		return dietmilkyear;
	}

	public void setDietmilkyear(String dietmilkyear){

		this.dietmilkyear = dietmilkyear;
	}

}