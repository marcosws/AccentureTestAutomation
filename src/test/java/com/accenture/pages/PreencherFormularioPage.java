package com.accenture.pages;

import com.accenture.core.BasePage;
import com.accenture.core.DriverFactory;

public class PreencherFormularioPage extends BasePage {
	
	public PreencherFormularioPage() {
		this.setDriver(DriverFactory.getDriver());
	}
	
	/* ********  Aba: Enter Vehicle Data ******** */
	
	public String validarAbaEnterVehicleData() {
		if(this.waitElement(Attribute.Id, "entervehicledata", 7)) {
			return this.getNameElement(Attribute.Id, "entervehicledata");
		}
		return "";
	}
	
	public String validarAbaEnterInsurantData() {
		if(this.waitElement(Attribute.Id, "enterinsurantdata", 7)) {
			return this.getNameElement(Attribute.Id, "enterinsurantdata");
		}
		return "";
	}
	
	public String validarAbaEnterProductData() {
		if(this.waitElement(Attribute.Id, "enterproductdata", 7)) {
			return this.getNameElement(Attribute.Id, "enterproductdata");
		}
		return "";
	}
	
	public String validarAbaSelectPriceOption() {
		if(this.waitElement(Attribute.Id, "selectpriceoption", 7)){
			return this.getNameElement(Attribute.Id, "selectpriceoption");
		}
		return "";
	}
	
	public String validarAbaSendQuote() {
		if(this.waitElement(Attribute.Id,"sendquote",7)) {
			return this.getNameElement(Attribute.Id, "sendquote");
		}
		return "";
	}
	
	public void selecionarMake(String make) {
		this.selectElement(Attribute.Id, "make", make);
	}
	
	public void selecionarModel(String model) {
		this.selectElement(Attribute.Id, "model", model);
	}
	
	public void digitarCylinderCapacity(String cylinderCapacity) {
		this.editElement(Attribute.Id, "cylindercapacity", cylinderCapacity);
	}

	public void digitarEnginePerformance(String enginePerformance) {
		this.editElement(Attribute.Id, "engineperformance", enginePerformance);
	}
	
	public void digitarDateOfManufacture(String dateOfManufacture) {
		this.editElement(Attribute.Id, "dateofmanufacture", dateOfManufacture);
	}
	
	public void selecionarNumberOfSeats(String numberOfSeats) {
		this.selectElement(Attribute.Id, "numberofseats", numberOfSeats);
	}
	
	public void selecionarRightHandDrive(String rightHandDrive) {
		if(rightHandDrive.equalsIgnoreCase("YES")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span", true);
		}
		else if(rightHandDrive.equalsIgnoreCase("NO")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[2]/span", true);
		}
	}
	
	public void selecionarNumberOfSeats2(String numberOfSeats2) {
		this.selectElement(Attribute.Id, "numberofseatsmotorcycle", numberOfSeats2);
	}
	
	public void selecionarFuelType(String fuelType) {
		this.selectElement(Attribute.Id, "fuel", fuelType);
	}
	
	public void digitarPayload(String payload) {
		this.editElement(Attribute.Id, "payload", payload);
	}
	
	public void digitarTotalWeight(String totalWeight) {
		this.editElement(Attribute.Id, "totalweight", totalWeight);
	}
	
	public void digitarListPrice(String listPrice) {
		this.editElement(Attribute.Id, "listprice", listPrice);
	}
	
	public void digitarLicencePlateNumber(String licencePlateNumber) {
		this.editElement(Attribute.Id, "licenseplatenumber", licencePlateNumber);
	}
	
	public void digitarAnnualMileage(String annualMileage) {
		this.editElement(Attribute.Id, "annualmileage", annualMileage);
	}
	
	public void clicarNext() {
		
		if(this.waitElement(Attribute.Id, "nextenterinsurantdata", 1)) {
			this.clickElement(Attribute.Id, "nextenterinsurantdata");
		}
		else if(this.waitElement(Attribute.Id, "nextenterproductdata", 1)) {
			this.clickElement(Attribute.Id, "nextenterproductdata");
		}
		else if(this.waitElement(Attribute.Id, "nextselectpriceoption", 1)) {
			this.clickElement(Attribute.Id, "nextselectpriceoption");
		}
		else if(this.waitElement(Attribute.Id, "nextsendquote", 1)) {
			this.clickElement(Attribute.Id, "nextsendquote");
		}

	}
	
	/* ********  Aba: Enter Insulrant Data ******** */
	
	public void digitarFirstName(String firstName) {
		this.editElement(Attribute.Id, "firstname", firstName);
	}
	public void digitarLastName(String lastName) {
		this.editElement(Attribute.Id, "lastname", lastName);
	}
	public void digitarDateOfBirth(String dateOfBirth) {
		this.editElement(Attribute.Id, "birthdate", dateOfBirth);
	}
	public void selecionarGender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span", true);
		}
		else if(gender.equalsIgnoreCase("Female")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span", true);
		}
	}
	public void digitarStreetAddress(String streetAddress) {
		this.editElement(Attribute.Id, "streetaddress", streetAddress);
	}
	public void selecionarCountry(String country) {
		this.selectElement(Attribute.Id, "country", country);
	}
	public void digitarZipCode(String zipCode) {
		this.editElement(Attribute.Id, "zipcode", zipCode);
	}
	public void digitarCity(String city) {
		this.editElement(Attribute.Id, "city", city);
	}
	public void selecionarOccupation(String occupation) {
		this.selectElement(Attribute.Id, "occupation", occupation);
	}
	public void selecionarHobbies(String hobbies) {
		String[] arrhobbies = hobbies.split(";");
		for(String strhobbies: arrhobbies) {
			if(strhobbies.equals("Speeding")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span", true);
			}
			else if(strhobbies.equals("Bungee Jumping")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]/span", true);
			}
			else if(strhobbies.equals("CliffDiving")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]/span", true);
			}
			else if(strhobbies.equals("Skydiving")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span", true);
			}
			else if(strhobbies.equals("Other")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span", true);
			}
		}
	}
	public void digitarWebsite(String website) {
		this.editElement(Attribute.Id, "website", website);
	}
	
	public void selecionarPicture(String picture) {
		
		this.clickElement(Attribute.Id, "open");
		this.openDialog(System.getProperty("user.dir") + "\\src\\main\\resources\\picture\\" + picture);

	}
	
	/* ********  Aba: Enter Insulrant Data ******** */
	
	public void digitarStartDate(String startDate) {
		this.editElement(Attribute.Id, "startdate", startDate);
	}
	public void selecionarInsuranceSum(String insuranceSum) {
		this.selectElement(Attribute.Id, "insurancesum", insuranceSum);
	}
	public void selecionarMeritRating(String meritRating) {
		this.selectElement(Attribute.Id, "meritrating", meritRating);
	}
	public void selecionarDamageInsurance(String damageInsurance) {
		this.selectElement(Attribute.Id, "damageinsurance", damageInsurance);
	}
	public void selecionarOptionalProducts(String optionalProducts) {
		String[] arrOptionalProducts = optionalProducts.split(";");
		for(String strOptionalProducts: arrOptionalProducts) {
			if(strOptionalProducts.equals("Euro Protection")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span", true);
			}
			else if(strOptionalProducts.equals("Legal Defence Insurance")) {
				this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span", true);
			}
		}
		
	}
	public void selecionarCourtesyCar(String courtesyCar) {
		this.selectElement(Attribute.Id, "courtesycar", courtesyCar);
	}
	
	/* ********  Aba: Select Price Option ******** */
	
	public void selecionarSelectOption(String selectOption) {
		if(selectOption.equalsIgnoreCase("Silver")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span", true);
		}
		else if(selectOption.equalsIgnoreCase("Gold")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span", true);
		}
		else if(selectOption.equalsIgnoreCase("Platinum")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span", true);
		}
		else if(selectOption.equalsIgnoreCase("Ultimate")) {
			this.selectElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span", true);
		}
	}
	
	public String validarViewQuote() {
		if(this.waitElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[1]/div/div[1]/div/div[2]", 7)) {
			return this.getTextElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[1]/div/div[1]/div/div[2]");
		}
		return "";
	}
	public String validarDownloadQuote() {
		if(this.waitElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[1]/div/div[2]/div/div[2]", 7)) {
			return this.getTextElement(Attribute.Xpath, "/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[1]/div/div[2]/div/div[2]");
		}
		return "";
	}
	
	/* ********  Aba: Send Quote ******** */
	
	
	public void digitarEmail(String email) {
		this.editElement(Attribute.Id, "email", email);
	}
	
	public void digitarPhone(String phone) {
		this.editElement(Attribute.Id, "phone", phone);
	}
	
	public void digitarUsername(String username) {
		this.editElement(Attribute.Id, "username", username);
	}
	
	public void digitarPassword(String password) {
		this.editElement(Attribute.Id, "password", password);
	}
	
	public void digitarConfirmPassword(String confirmpassword) {
		this.editElement(Attribute.Id, "confirmpassword", confirmpassword);
	}
	
	public void digitarComments(String comments) {
		this.editElement(Attribute.Id, "Comments", comments);
	}
	
	public String validaMensagemFinal() { // Sending e-mail success!
		if(this.waitElement(Attribute.TagName, "h2", 18)) {
			return this.getTextElement(Attribute.TagName, "h2");
		}
		else {
			return "";
		}
	}
	
	public void clicarOK() {
		this.clickElement(Attribute.Xpath, "/html/body/div[4]/div[7]/div/button");
	}

	public void clicarSend() {
		this.clickElement(Attribute.Id, "sendemail");
	}
	
}
