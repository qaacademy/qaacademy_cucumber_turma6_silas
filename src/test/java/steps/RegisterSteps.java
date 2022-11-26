package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
@Before
    public void abrirBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    @AfterStep()
    public void print(){
        TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
        byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        InputStream printStream = new ByteArrayInputStream(printBytes);
        Allure.addAttachment("TESTE",printStream);
    }


    @After()
    public void fecharBrowser(){
        driver.quit();
    }
    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
        System.out.println("Cheguei");
    }

    @Quando("preencho nome {string} e sobrenome {string}")
    public void preenchoNomeESobrenome(String arg0, String arg1) {
        System.out.println("Cheguei");
    }

    @E("preencho o campo Endereco com valor {string}")
    public void preenchoOCampoEnderecoComValor(String arg0) {
        System.out.println("Cheguei");
    }

    @E("preencho o email com valor {string}")
    public void preenchoOEmailComValor(String arg0) {
        System.out.println("Cheguei");
    }

    @E("preencho o telefone com o valor {string}")
    public void preenchoOTelefoneComOValor(String arg0) {
        System.out.println("Cheguei");
    }

    @E("clico no checkbox Male, clico no checkbox Movies")
    public void clicoNoCheckboxMaleClicoNoCheckboxMovies() {
        System.out.println("Cheguei");
    }

    @E("seleciono a Skills {string}")
    public void selecionoASkills(String arg0) {
        System.out.println("Cheguei");
    }

    @E("seleciono um country")
    public void selecionoUmCountry() {
        System.out.println("Cheguei");
    }

    @E("seleciono o ano {string}, o mes {string}, e o dia {string}")
    public void selecionoOAnoOMesEODia(String arg0, String arg1, String arg2) {
        System.out.println("Cheguei");
    }

}
