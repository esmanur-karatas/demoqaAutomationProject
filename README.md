# Selenium WebDriver Form Automation Testing

Bu proje, Selenium WebDriver kullanarak DemoQA web sitesindeki bir formun çeşitli bölümlerini test etmek için yazılmıştır. Amaç, formun doğru çalışıp çalışmadığını kontrol etmektir.

## Kod Bölümleri

### **BasePage**
- Temel bir sayfa sınıfıdır.
- Selenium WebDriver'ı alarak, web sayfasındaki öğeleri bulma, tıklama, metin girme ve öğe seçilme durumunu kontrol etme gibi temel işlemleri yapar.
- Bu sınıf, tüm test sayfalarının ortak işlevlerini içeren bir temel sınıf görevi görür.

### **DemoqaFormPages**
- DemoQA web sitesindeki formu temsil eden bir sınıftır.
- Sayfanın çeşitli öğelerine (örneğin: ad, soyad, email) veri girişi yapma işlevlerini içerir.
- Bu sınıf ayrıca, kullanıcı adı, soyadı ve e-posta gibi form alanlarındaki verileri almayı da sağlar.
- Formu doldurup test etmek için, `setName`, `setLastName`, ve `setEmail` gibi metotlar kullanılır.

### **GenderSection**
- Formdaki cinsiyet seçimi bölümünü temsil eder.
- Kullanıcıya cinsiyetini seçmesi için "Erkek", "Kadın" veya "Diğer" seçeneklerini sunar.
- Bu sınıf, cinsiyet seçimlerini tıklamak ve doğrulamak için kullanılır.
- `clickRadioButton` metodu ile cinsiyet seçeneği tıklanabilir, `isRadioButtonChecked` ile de seçili olup olmadığı kontrol edilebilir.

### **BaseTest**
- Testlerin çalıştırılması ve WebDriver yönetimini sağlayan temel sınıftır.
- `@BeforeAll`, `@BeforeEach`, `@AfterEach` gibi JUnit 5 öznitelikleri kullanarak her test öncesi ve sonrası gerekli ayarları yapar.
- WebDriver'ı başlatır, test öncesi her bir metot için Chrome tarayıcısını açar ve test sonrası tarayıcıyı kapatır.

### **FormTesting**
- DemoQA formunun ad, soyad ve e-posta alanları için yapılan testlerdir.
- Testlerin amacı, formdaki input alanlarının doğru şekilde veri kabul edip etmediğini kontrol etmektir.
- `test_SetName`, `test_LastName`, ve `test_Email` metotları, sırasıyla ad, soyad ve e-posta için doğrulama yapar.

### **TestGenderSection**
- Cinsiyet seçeneği testlerine yönelik sınıftır.
- Erkek, kadın ve diğer cinsiyet seçeneklerinin doğru şekilde tıklanıp tıklanmadığını test eder.
- `checkMaleRadioButton`, `checkFemaleRadioButton`, ve `checkOtherRadioButton` metotları, ilgili cinsiyet seçeneklerinin seçilip seçilmediğini doğrular.

## Özet

Bu kodlar, Selenium WebDriver kullanarak bir web formunun çeşitli bölümlerinin (ad, soyad, e-posta ve cinsiyet seçimi) doğru çalışıp çalışmadığını test etmek için yazılmıştır. JUnit test çerçevesi kullanılarak, her bir test senaryosu ile form elemanlarının doğru şekilde etkileşime girip girmediği kontrol edilmektedir.
