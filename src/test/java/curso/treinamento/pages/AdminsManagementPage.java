package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;

public class AdminsManagementPage {
	
	public AdminsManagementPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (xpath = "//div[text()='Admins Management']")
	private WebElement tituloPagina;
	
	@FindBy (xpath = "//button[contains(text(),'Add')]")
	private WebElement btnAdd;

	
	public boolean validar_pagina() { 
		return Helper.elemento_existe(tituloPagina, 10);
	}
	
	public void clicar_btn_add() { 
		btnAdd.click();
	}
	
	public boolean validar_email_inserido(String email) { 
		return Helper.elemento_existe(Hooks.get_driver().findElement(By.xpath("//td//a[text()='"+ email +"']")), 10);
	}
}