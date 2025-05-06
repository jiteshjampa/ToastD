


# 🥂 ToastD – Curated Product Lists

Welcome to **ToastD**, where we serve handpicked essentials for every hustle! ✨ This full-stack app features curated product lists built with **Spring Boot**, **Next.js**, and topped with a dash of **DevOps** deployment.

> “Handpicked for your hustle.” – that's our vibe. 😎

---

## 🚀 Live Demo

- 🌐 **Frontend (Next.js):** [toast-d.vercel.app](https://toast-d.vercel.app/)
- ⚙️ **Backend (Spring Boot):** [13.235.75.105:8080](http://13.235.75.105:8080)

---

## 🧩 Features

### 📦 Backend – Spring Boot

- **Endpoint:** `GET /lists/{slug}`
- Returns curated product list data:
  - `Product`: `id`, `title`, `imageUrl`, `price`, `discount`, `category`, `tags[]`
  - `List`: `name`, `slug`, `description`, `products[]`
- Uses **in-memory H2** database with preloaded data (`DataLoader`)
- ✅ Simple, fast, and RESTful

### 💻 Frontend – Next.js

- Dynamic route: `/lists/[slug]`  
- Server-side rendering (SSR) using `getServerSideProps`
- ✨ UI:
  - ToastD-style header
  - Grid view for products
  - Clean layout with description and price info
- Styled for a fun and modern look

---

## ☁️ DevOps – Deployment

- Backend hosted on **AWS EC2** (Ubuntu with Spring Boot)
- Frontend hosted on **Vercel**
- CI-ready and scalable for future enhancements

---

## 📚 Example Data (Preloaded)

| List Name              | Slug                 | Sample Product       |
|------------------------|----------------------|----------------------|
| ISB Essentials         | `isb-essentials`     | Bluetooth Speaker 🔊 |
| WFH Must-Haves         | `wfh-must-haves`     | Ergonomic Chair 🪑    |
| Fitness Finds          | `fitness-finds`      | Resistance Bands 🏋️  |
| Dorm Room Picks        | `dorm-room-picks`    | Mini Fridge 🧊        |
| Creator Starter Pack   | `creator-starter-pack` | Ring Light 💡      |
| Travel Essentials      | `travel-essentials`  | Neck Pillow ✈️       |
| Zen Desk Setup         | `zen-desk-setup`     | Aroma Diffuser 🌿     |

---

## 🛠️ Tech Stack

| Layer     | Tech           |
|-----------|----------------|
| Frontend  | Next.js, React |
| Backend   | Spring Boot, Java |
| Database  | H2 (in-memory) |
| Deployment| Vercel (FE), AWS EC2 (BE) |

---

## 📁 Folder Structure

```

toastd/
├── backend/
│   ├── src/main/java/com/toastd/demo
│   │   ├── controller/
│   │   ├── entity/
│   │   ├── repository/
│   │   └── DataLoader.java
├── frontend/
│   ├── pages/lists/\[slug].tsx
│   ├── components/
│   └── styles/

````

---

## 🔧 How to Run Locally

### ⚙️ Backend (Spring Boot)

#### Prerequisites:
- Java 17+
- Maven

#### Steps:
```bash
cd backend
./mvnw spring-boot:run
````

> The backend server will start on `http://localhost:8080`

You can test it using:

```
http://localhost:8080/lists/isb-essentials
```

---

### 💻 Frontend (Next.js)

#### Prerequisites:

* Node.js 18+

#### Steps:

```bash
cd frontend
npm install
npm run dev
```

> The frontend app will run on `http://localhost:3000`

Open:

```
http://localhost:3000/lists/isb-essentials
```



