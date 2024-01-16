package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class is for Home Page Pom class
 * @author Aniruddha Das
 */
public class HomePage {

	@FindBy(xpath = "//span[text()='Dashboard Management']")
	private WebElement dBoardManagement;
	
	@FindBy(xpath = "//span[text()='Promotions & Discounts']")
	private WebElement promotionsAndDiscount;
	
	@FindBy(xpath = "//span[text()='Categories']")
	private WebElement categories;
	
	@FindBy(xpath = "(//span[text()='Offers'])[1]")
	private WebElement offers;
	
	@FindBy(xpath = "//span[text()='Banner Management']")
	private WebElement bannerManagement;
	
	@FindBy(xpath = "//span[contains(text(),'What')]")
	private WebElement whatsNew;
	
	@FindBy(xpath = "//span[text()='Test Management']")
	private WebElement testManagement;
	
	
	@FindBy(xpath = "//span[text()='Department Management']")
	private WebElement departmentManagement;
	
	@FindBy(xpath = "//span[text()='FAQs Management']")
	private WebElement faqsManagement;
	
	@FindBy(xpath = "//span[text()='FAQ-Category']")
	private WebElement faqCategory;
	
	@FindBy(xpath = "FAQs")
	private WebElement faqs;
	
	@FindBy(xpath = "//span[text()='SEO Management']")
	private WebElement seoManagement;
	
	@FindBy(xpath = "//span[text()='SEO']")
	private WebElement seo;
	
	@FindBy(xpath = "//span[text()='Ticket Management']")
	private WebElement ticketManagement;
	
	@FindBy(xpath = "//span[text()='HR Management']")
	private WebElement hrManagement;
	
	@FindBy(xpath = "//span[text()='Job Applications']")
	private WebElement jobApplications;
	
	@FindBy(xpath = "//span[text()='Job Posts']")
	private WebElement jobPosts;
	
	@FindBy(xpath = "//span[text()='BTL/Non-BTL Management ']")
	private WebElement btl;
	
	@FindBy(xpath = "(//span[text()='Offers'])[2]")
	private WebElement offersBtl;
	
	@FindBy(xpath = "//span[text()='Customers']")
	private WebElement customers;
	
	@FindBy(xpath = "//span[text()='Users Management']")
	private WebElement userManagement;
	
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement users;
	
	@FindBy(xpath = "//span[text()='Roles']")
	private WebElement roles;
	
	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement logout;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	public WebElement getdBoardManagement() {
		return dBoardManagement;
	}

	public WebElement getPromotionsAndDiscount() {
		return promotionsAndDiscount;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getOffers() {
		return offers;
	}

	public WebElement getBannerManagement() {
		return bannerManagement;
	}

	public WebElement getWhatsNew() {
		return whatsNew;
	}

	public WebElement getTestManagement() {
		return testManagement;
	}

	public WebElement getDepartmentManagement() {
		return departmentManagement;
	}

	public WebElement getFaqsManagement() {
		return faqsManagement;
	}

	public WebElement getFaqCategory() {
		return faqCategory;
	}

	public WebElement getFaqs() {
		return faqs;
	}

	public WebElement getSeoManagement() {
		return seoManagement;
	}

	public WebElement getSeo() {
		return seo;
	}

	public WebElement getTicketManagement() {
		return ticketManagement;
	}

	public WebElement getHrManagement() {
		return hrManagement;
	}

	public WebElement getJobApplications() {
		return jobApplications;
	}

	public WebElement getJobPosts() {
		return jobPosts;
	}

	public WebElement getBtl() {
		return btl;
	}

	public WebElement getOffersBtl() {
		return offersBtl;
	}

	public WebElement getCustomers() {
		return customers;
	}

	public WebElement getUserManagement() {
		return userManagement;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getRoles() {
		return roles;
	}

	public WebElement getLogout() {
		return logout;
	}
	/**
	 * this is business library for promotionsAndDiscounts with categories
	 */
	public void clickPromotionsAndDiscountsWithCategories()
	{
		promotionsAndDiscount.click();
		categories.click();
	}
	/**
	 * this is business library for promotionsAndDiscounts with offers
	 */
	public void clickPromotionsAndDiscountsWithOffers()
	{
		promotionsAndDiscount.click();
		offers.click();
	}
	/**
	 * this method is to click on department management
	 */
	public void clickOnDepartmentManagement()
	{
		departmentManagement.click();
	}
	/**
	 * this method is use to click on faqCategory
	 */
	public void clickOnFaqsManagementWithFaqCategory()
	{
		faqsManagement.click();
		faqCategory.click();
	}
	/**
	 * this method is to click on faq-s
	 */
	public void clickOnFaqsManagementWithFaqs()
	{
		faqsManagement.click();
		faqs.click();
	}
	/**
	 * this method is to click on Seo
	 */
	public void clickOnSeo()
	{
		seoManagement.click();
		seo.click();
	}
	/**
	 * this method is for logOut
	 */
	public void logoutOperation()
	{
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
}
