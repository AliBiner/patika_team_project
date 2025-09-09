📌 Genel Senaryo

- Kullanıcı uygulamayı açar.
- Kullanıcıdan isim veya ID ile giriş yapması istenir.

Menü:
- Quiz’e başla
- Skor Tablosunu Görüntüle
- Çıkış
- Kullanıcı quiz’i oynar, sorulara cevap verir.
- Sistem doğru/yanlışları sayar, puanı hesaplar.
Sonuçlar hem SQL veritabanına kaydedilir.
- Puan tablosu (leaderboard) görüntülenebilir.
- İşlemler log dosyasına kaydedilir.

Ekstra Özellikler (Hackathon için opsiyonel)
- Zorluk seviyeleri: Kolay/Orta/Zor sorular (SQL’de difficulty sütunu)
- Çoklu oyuncu modu: Thread ile aynı anda 2 oyuncu yarışabilir
- Puan çarpanı: Soruyu ne kadar hızlı cevaplarsa o kadar fazla puan
- Top N skor tablosu: En yüksek 5 skoru göster