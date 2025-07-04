# 🧼 Clean Code Java Project – Student Success Evaluation App

## 📌 Proje Özeti

Bu proje, öğrenci notlarının çeşitli stratejilere göre değerlendirilip geçme-kalma durumunun belirlenmesini sağlayan modüler bir Java uygulamasıdır. Spring gibi framework'ler kullanılmadan, tamamen sade Java ile geliştirilmiştir.

Uygulama, Clean Code prensiplerine göre yazılmış, **Docker**, **Docker Compose** ve **GitHub Actions** ile CI/CD süreçlerine entegre edilmiştir.

---

## 🔧 Teknolojiler ve Araçlar 

- ✅ Java 17  
- ✅ Maven  
- ✅ Docker & Docker Compose  
- ✅ GitHub Actions (CI/CD)  
- ✅ JUnit 5  
- ✅ Strategy Pattern  
- ✅ Clean Code & SOLID prensipleri  

---

## 🧩 Proje Yapısı

```
src
├── main
│   ├── java
│   │   └── org.Musoft
│   │       ├── decider
│   │       │   ├── IPassFailDecider
│   │       │   └── PassFailDecider
│   │       ├── log
│   │       │   ├── ILogger
│   │       │   └── ConsoleLogger
│   │       ├── model
│   │       │   └── Student
│   │       ├── printer
│   │       │   ├── IConsolResultPrinter
│   │       │   └── ConsolResultPrinter
│   │       ├── service
│   │       │   ├── strategy
│   │       │   │   ├── AverageCalculatorService
│   │       │   │   ├── ITopStudentFinder
│   │       │   │   └── TopStudentFinder
│   │       └── starter
│   │           └── Main.java
│   └── resources
├── test
│   └── java
│       ├── PassFailDeciderTest
│       ├── SimpleAverageStrategyTest
│       ├── TestCalculateAverage
│       └── WeightedAverageStrategyTest
```

---

## ⚙️ Kullanılan Bileşenler

| Modül | Açıklama |
|-------|----------|
| `decider` | Öğrencinin geçip geçmediğini belirleyen yapı. |
| `log` | Konsola log yazımı yapılır. |
| `model` | Öğrenci nesnesi (`Student`). |
| `printer` | Sonuçlar konsola yazdırılır. |
| `service/strategy` | Ortalama hesaplama stratejileri yer alır. |
| `starter` | Uygulamanın çalıştırıldığı ana sınıf. |

---

## 🧪 Testler

Uygulama aşağıdaki test sınıfları ile test edilmiştir:

- `PassFailDeciderTest`
- `SimpleAverageStrategyTest`
- `TestCalculateAverage`
- `WeightedAverageStrategyTest`

---

## 🧠 Clean Code Özellikleri

| İlke | Açıklama |
|------|----------|
| **SRP (Single Responsibility)** | Her sınıf sadece tek bir sorumluluğa sahiptir. |
| **Anlamlı İsimlendirme** | Değişken, metot ve sınıf adları açıklayıcıdır. |
| **Kapsülleme** | Alanlar `private`, dış etkileşim `getter/setter` ile sağlanır. |
| **Soyutlama (Abstraction)** | `ILogger`, `IAverageCalculator` gibi arayüzlerle yapı genişletilmiştir. |
| **Design Pattern** | Strategy Pattern ile ortalama hesaplama modülerleştirilmiştir. |
| **Test Edilebilirlik** | JUnit 5 ile test yazılabilir ve çalıştırılabilir yapı sağlanmıştır. |

---

## ⚙️ Başlangıç Ön Koşulları (Prerequisites)

Projenin sorunsuz çalışması için aşağıdaki araçların sisteminizde kurulu olması gerekmektedir:

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Java 17](https://adoptium.net/)
- [Maven](https://maven.apache.org/)

---

## 🚀 Uygulamanın Başlatılması

### 1. Projeyi Klonlayın

```bash
git clone https://github.com/HuseyinErkek/RefactoredStudentApp
cd RefactoredStudentApp
```

### 2. Docker ile Başlatın

```bash
# Jar dosyasını oluşturun
mvn clean install

# Docker imajını oluşturup container'ı başlatın
docker-compose up --build
```

> Uygulama başarıyla çalıştığında, belirlediğiniz port üzerinden erişilebilir hale gelir (örneğin `localhost:8080`).

---

## 🔄 CI/CD (GitHub Actions)

Proje, GitHub Actions ile entegre edilmiştir. CI/CD süreci, her commit veya pull request işleminde otomatik olarak çalışır.

### Yapılandırma Dosyası:

```
.github/workflows/main.yaml
```

Bu yapı:

- Testleri otomatik olarak çalıştırır  
- Uygulamanın derlenmesini sağlar  
- Hataları erken aşamada yakalayarak güvenli bir geliştirme süreci sağlar  


