package com.accenture.steps;

import org.junit.Assert;

import com.accenture.context.ContextApp;
import com.accenture.pages.PreencherFormularioPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class PreencherFormularioSteps {

	
	@Dado("que acesso o sampleapp")
	public void que_acesso_o_sampleapp() {
	    ContextApp.startAppication();
	}

	@Dado("que estiver na aba {string}")
	public void que_estiver_na_aba(String aba) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		switch(aba){
		case "Enter Vehicle Data":
			System.out.println(preencherFormularioPage.validarAbaEnterVehicleData());
			Assert.assertTrue(preencherFormularioPage.validarAbaEnterVehicleData().contains(aba));
			break;
		case "Enter Insurant Data":
			Assert.assertTrue(preencherFormularioPage.validarAbaEnterInsurantData().contains(aba));
			break;
		case "Enter Product Data":
			Assert.assertTrue(preencherFormularioPage.validarAbaEnterProductData().contains(aba));
			break;
		case "Select Price Option":
			Assert.assertTrue(preencherFormularioPage.validarAbaSelectPriceOption().contains(aba));
			break;
		case "Send Quote":
			Assert.assertTrue(preencherFormularioPage.validarAbaSendQuote().contains(aba));
			break;
		}
	}

	@Quando("selecionar o campo Make {string}")
	public void selecionar_o_campo_make(String make) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarMake(make);
	}

	@Quando("preencher o campo Model {string}")
	public void preencher_o_campo_model_model(String model) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarModel(model);
	}

	@Quando("preencher o campo Cylinder Capacity {string}")
	public void preencher_o_campo_cylinder_capacity(String cylinderCapacity) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarCylinderCapacity(cylinderCapacity);
	}
	
	
	@Quando("preencher o campo Engine Performance {string}")
	public void preencher_o_campo_engine_performance_(String enginePerformance) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarEnginePerformance(enginePerformance);
	}
	
	@Quando("preencher o campo Date of Manufacture {string}")
	public void preencher_o_campo_date_of_manufacture(String dateOfManufacture) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarDateOfManufacture(dateOfManufacture);
	}

	@Quando("selecionar o campo Number of Seats {string}")
	public void selecionar_o_campo_number_of_seats_number_of_seats(String numberOfSeats) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarNumberOfSeats(numberOfSeats);
	}
	
	
	@Quando("selecionar o campo Right Hand Drive {string}")
	public void selecionar_o_campo_right_hand_drive(String rightHandDrive) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarRightHandDrive(rightHandDrive);
	}
	
	@Quando("selecionar o campo Number of Seats2 {string}")
	public void selecionar_o_campo_number_of_seats2(String numberOfSeats2) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarNumberOfSeats2(numberOfSeats2);
	}
	
	

	@Quando("selecionar o campo Fuel Type {string}")
	public void selecionar_o_campo_fuel_type_fuel_type(String fuelType) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarFuelType(fuelType);
	}

	@Quando("preencher o campo Payload {string}")
	public void preencher_o_campo_payload(String payload) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarPayload(payload);
	}

	@Quando("preencher o campo Total Weight {string}")
	public void preencher_o_campo_total_weight(String totalWeight) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarTotalWeight(totalWeight);
	}
	
	
	@Quando("preencher o campo List Price {string}")
	public void preencher_o_campo_list_price_list_price(String listPrice) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarListPrice(listPrice);
	}

	@Quando("preencher o campo License Plate Number {string}")
	public void preencher_o_campo_license_plate_number_license_plate_number(String licencePlateNumber) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarLicencePlateNumber(licencePlateNumber);
	}

	@Quando("preencher o campo Annual Mileage {string}")
	public void preencher_o_campo_annual_mileage_annual_mileage(String annualMileage) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarAnnualMileage(annualMileage);
	}

	@Quando("clicar no botão Next")
	public void clicar_no_botão_next() {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.clicarNext();
	}

	@Então("valido apresentação da aba {string}")
	public void valido_apresentação_da_aba(String aba) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		switch(aba){
		case "Enter Vehicle Data":
			Assert.assertTrue(preencherFormularioPage.validarAbaEnterVehicleData().contains(aba));
			break;
		case "Enter Insurant Data":
			Assert.assertTrue(preencherFormularioPage.validarAbaEnterInsurantData().contains(aba));
			break;
		case "Enter Product Data":
			Assert.assertTrue(preencherFormularioPage.validarAbaEnterProductData().contains(aba));
			break;
		case "Select Price Option":
			Assert.assertTrue(preencherFormularioPage.validarAbaSelectPriceOption().contains(aba));
			break;
		case "Send Quote":
			Assert.assertTrue(preencherFormularioPage.validarAbaSendQuote().contains(aba));
			break;
		}
	}

	@Quando("preencher o campo Fisrt Name {string}")
	public void preencher_o_campo_fisrt_name_fist_name(String firstName) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarFirstName(firstName);
	}

	@Quando("preencher o campo Last Name {string}")
	public void preencher_o_campo_last_name_last_name(String lastName) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarLastName(lastName);
	}

	@Quando("preencher o campo Date of Birth {string}")
	public void preencher_o_campo_date_of_birth_date_of_birth(String dateOfBirth) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarDateOfBirth(dateOfBirth);
	}

	@Quando("selecionar o campo Gender {string}")
	public void selecionar_o_campo_gender_gender(String gender) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarGender(gender);
	}

	@Quando("preencher o campo Street Address {string}")
	public void preencher_o_campo_street_address_street_address(String streetAddress) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarStreetAddress(streetAddress);
	}

	@Quando("selecionar o campo Country {string}")
	public void selecionar_o_campo_coutry_country(String country) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarCountry(country);
	}

	@Quando("preencher o campo Zip Code {string}")
	public void preencher_o_campo_zip_code_zip_code(String zipCode) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarZipCode(zipCode);
	}

	@Quando("preencher o campo City {string}")
	public void preencher_o_campo_city_city(String city) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarCity(city);
	}

	@Quando("selecionar o campo Occupation {string}")
	public void selecionar_o_campo_occupation_occupation(String occupation) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarOccupation(occupation);
	}

	@Quando("assinalar os campos Hobbies {string}")
	public void assinalar_os_campos_hobbies_hobbies(String hobbies) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarHobbies(hobbies);
	}

	@Quando("preencher o campo Website {string}")
	public void preencher_o_campo_website_website(String website) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarWebsite(website);
	}

	@Quando("preencher o campo Picture {string}")
	public void preencher_o_campo_picture_picture(String picture) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarPicture(picture);
		
	}

	@Quando("preencher o campo Start Date {string}")
	public void preencher_o_campo_start_date_start_date(String startDate) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarStartDate(startDate);
	}

	@Quando("selecionar o campo Insurance Sum {string}")
	public void selecionar_o_campo_insurance_sum_insurance_sum(String insuranceSum) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarInsuranceSum(insuranceSum);
	}

	@Quando("selecionar o campo Merit Rating {string}")
	public void selecionar_o_campo_merit_rating_merit_rating(String meritRating) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarMeritRating(meritRating);
	}

	@Quando("selecionar o campo Damage Insurance {string}")
	public void selecionar_o_campo_damage_insurance_damage_insurance(String damageInsurance) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarDamageInsurance(damageInsurance);
	}

	@Quando("assinalar os campos Optional Products {string}")
	public void assinalar_os_campos_optional_products_optional_product(String optionalProducts) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarOptionalProducts(optionalProducts);
	}

	@Quando("selecionar o campo Coutesy Car {string}")
	public void selecionar_o_campo_coutesy_car_coutesy_car(String courtesyCar) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarCourtesyCar(courtesyCar);
	}

	@Quando("selecionar uma opção {string}")
	public void selecionar_uma_opção_opcao(String selectOption) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.selecionarSelectOption(selectOption);
	}

	@Então("valido a apresentação do campo view quote")
	public void valido_a_apresentação_do_campo_view_quote() {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		Assert.assertEquals("VIEW QUOTE", preencherFormularioPage.validarViewQuote());
	}

	@Então("valido o link para o documento")
	public void valido_o_link_para_o_documento() {
		
	}

	@Então("valido a apresentação do campo download quote")
	public void valido_a_apresentação_do_campo_download_quote() {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		Assert.assertEquals("DOWNLOAD QUOTE", preencherFormularioPage.validarDownloadQuote());
	}

	@Então("valido o download para o documento")
	public void valido_o_download_para_o_documento() {
		
		
	}

	@Quando("preencher o campo E-mail {string}")
	public void preencher_o_campo_e_mail_email(String email) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarEmail(email);
	}

	@Quando("preencher o campo Phone {string}")
	public void preencher_o_campo_phone_phone(String phone) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarPhone(phone);
	}

	@Quando("preencher o campo Username {string}")
	public void preencher_o_campo_username_username(String username) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarUsername(username);
	}

	@Quando("preencher o campo Password {string}")
	public void preencher_o_campo_password_password(String password) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarPassword(password);
	}

	@Quando("preencher o campo Confirm Password {string}")
	public void preencher_o_campo_confirm_password_confirm_password(String confirmpassword) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarConfirmPassword(confirmpassword);
	}

	@Quando("preencher o campo Comments {string}")
	public void preencher_o_campo_comments_comments(String comments) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.digitarComments(comments);
	}

	@Quando("clicar no botão Send")
	public void clicar_no_botão_send() {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		preencherFormularioPage.clicarSend();
	}

	@Então("valido a mensagem {string}")
	public void valido_a_mensagem(String mensagem) {
		PreencherFormularioPage preencherFormularioPage = new PreencherFormularioPage();
		Assert.assertEquals(mensagem, preencherFormularioPage.validaMensagemFinal());
		preencherFormularioPage.clicarOK();
		ContextApp.endApplication();
	}
	
}
