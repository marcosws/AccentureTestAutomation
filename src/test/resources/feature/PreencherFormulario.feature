#language: pt

@formulario
Funcionalidade: Preencher o formulário

	Esquema do Cenário: preencher o formulario com dados válidos validando a mensagem de sucesso no final

		Dado que acesso o sampleapp 
		E que estiver na aba "Enter Vehicle Data"
		Quando selecionar o campo Make <make>
		E preencher o campo Model <model>
		E preencher o campo Cylinder Capacity <cylinder_capacity>
		E preencher o campo Engine Performance <engine_performance>
		E preencher o campo Date of Manufacture <date_of_manufacture>
		E selecionar o campo Number of Seats <number_of_seats>
		E selecionar o campo Right Hand Drive <right_hand_drive>
		E selecionar o campo Number of Seats2 <number_of_seats2>
		E selecionar o campo Fuel Type <fuel_type>
		E preencher o campo Payload <payload>
		E preencher o campo Total Weight <total_weight>
		E preencher o campo List Price <list_price>
		E preencher o campo License Plate Number <license_plate_number>
		E preencher o campo Annual Mileage <annual_mileage>
		E clicar no botão Next
		Então valido apresentação da aba "Enter Insurant Data"
		
		Dado que estiver na aba "Enter Insurant Data"
		Quando preencher o campo Fisrt Name <fist_name>
		E preencher o campo Last Name <last_name>
		E preencher o campo Date of Birth <date_of_birth>
		E selecionar o campo Gender <gender>
		E preencher o campo Street Address <street_address>
		E selecionar o campo Country <country>
		E preencher o campo Zip Code <zip_code>
		E preencher o campo City <city>
		E selecionar o campo Occupation <occupation>
		E assinalar os campos Hobbies <hobbies>
		E preencher o campo Website <website>
		E preencher o campo Picture <picture>
		E clicar no botão Next 
		Então valido apresentação da aba "Enter Product Data"

		Dado que estiver na aba "Enter Insurant Data"
		Quando preencher o campo Start Date <start_date>
		E selecionar o campo Insurance Sum <insurance_sum>
		E selecionar o campo Merit Rating <merit_rating>
		E selecionar o campo Damage Insurance <damage_insurance>
		E assinalar os campos Optional Products <optional_product>
		E selecionar o campo Coutesy Car <coutesy_car>
		E clicar no botão Next
		Então valido apresentação da aba "Select Price Option"
		
		Dado que estiver na aba "Select Price Option"
		Quando selecionar uma opção <opcao>
		Então valido a apresentação do campo view quote
		E valido o link para o documento
		E valido a apresentação do campo download quote
		E valido o download para o documento
		Quando clicar no botão Next
		Então valido apresentação da aba "Send Quote"

		Dado que estiver na aba "Send Quote"
		Quando preencher o campo E-mail <email>
		E preencher o campo Phone <phone>
		E preencher o campo Username <username>
		E preencher o campo Password <password>
		E preencher o campo Confirm Password <confirm_password>
		E preencher o campo Comments <comments>
		E clicar no botão Send
		Então valido a mensagem "Sending e-mail success!"

		Exemplos:
		| make    | model    | cylinder_capacity | engine_performance | date_of_manufacture | number_of_seats | right_hand_drive | number_of_seats2 |fuel_type | payload | total_weight | list_price | license_plate_number | annual_mileage | fist_name | last_name | date_of_birth | gender | street_address      | country  | zip_code   | city        | occupation     | hobbies                             | website                | picture    | start_date   | insurance_sum  | merit_rating | damage_insurance | optional_product                          | coutesy_car | opcao     | email                       | phone         | username | password  | confirm_password | comments                               |   
		| "BMW"   |"Moped"   | "2000"            | "200"              | "10/10/2020"        | "1"             | "Yes"            | "1"              |"Diesel"  | "1000"  | "1000"       | "90000"    | "12"                 | "100"          | "Marcos"  | "Souza"   | "10/10/1988"  | "Male" | "Rua 12 de Outubro" | "Brazil" | "05260050" | "São Paulo" | "Selfemployed" | "Speeding;Bungee Jumping;Skydiving" | "http://accenture.com" | "java.png" | "10/10/2021" | "3.000.000,00" | "Bonus 9"    | "Full Coverage"  | "Euro Protection;Legal Defence Insurance" | "Yes"       | "Silver"  | "marcosws@accenture.com"    | "11988885555" | "marcos"  | "Ac1234" | "Ac1234"         | "Realizando a automação do formulário" | 


		
		   


		
	

    
    























