# 🧼 Clean Code Java Projesi – Öğrenci Not Ortalaması Hesaplama

## 📌 Proje Özeti

Bu Java tabanlı uygulama, bir öğrenci listesindeki her öğrencinin not ortalamasını hesaplayarak, **60 ve üzeri** not ortalamasına sahip öğrencileri “Geçti”, diğerlerini ise “Kaldı” olarak işaretler. Ayrıca **en yüksek ortalamaya** sahip öğrencinin bilgisi de konsola yazdırılır.

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

- [Docker]
- [Docker Compose]

---

## 🚀 Uygulamanın Başlatılması
### 1. Projeyi Klonlama

git clone https://github.com/HuseyinErkek/RefactoredStudentApp

### 2. Docker ile Başlatmak

```bash
docker-compose up --build
