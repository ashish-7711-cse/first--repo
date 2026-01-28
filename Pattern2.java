# masterplan.md

## App Name
**(Placeholder)** ExpenseTrackr – Smart Expense Manager

---

## 1. App Overview & Objectives

**Purpose:**  
A personal finance web app that allows users to manually track expenses from both savings and credit accounts. It provides separate analysis for each, empowering users to control spending, visualize monthly income vs expenses, and work toward better saving habits.

**Core Goals:**
- Track savings and credit card expenses in separate sections
- Provide monthly financial summaries and comparisons
- Deliver clear insights to help users avoid excessive spending
- Enable future features like savings tips and spending alerts

---

## 2. Target Audience

- Individuals managing **multiple payment types** (savings, credit)
- Users who want **simple but actionable analytics**
- Budget-conscious users seeking to **identify unnecessary spendings**
- Early-stage financial planners

---

## 3. Core Features (Phase 1)

### 📌 Manual Transaction Entry
- Fields: Date, Amount, Category, Type (Income/Expense), Account Type (Savings or Credit), Payment Method, Notes

### 📌 Two Account Sections
- Separate views for **Savings Account** and **Credit Card** transactions
- Home page shows links to both + summary section

### 📌 Home Dashboard
- Monthly Income vs Expense chart (Savings + Credit separated)
- Spending comparison widget: Shows which account is spending more

### 📌 User Authentication
- Email + Password login
- Optional: Google Sign-In

### 📌 Data Management
- Edit/delete individual transactions
- Export all data to CSV

---

## 4. High-Level Technical Stack (Recommended)

| Layer             | Recommendation                                      | Notes                                                                 |
|------------------|------------------------------------------------------|-----------------------------------------------------------------------|
| Frontend (Web)    | React with TypeScript or Next.js                    | Strong component structure, fast UI, scalable                        |
| Backend/API       | Node.js (Express) or Go (Gin)                       | Lightweight, suitable for early MVP                                  |
| Database          | PostgreSQL or SQLite (for MVP)                      | Relational structure works well for transaction data                 |
| Auth              | Firebase Auth or Auth0                              | Secure, easy integration, supports email/password + Google Sign-In   |
| Hosting           | Vercel / Netlify (frontend) + Render / Railway (API)| Easy to deploy and scale                                             |
| Charts/Analytics  | Chart.js or Recharts                                | Clean, responsive data visuals                                       |

---

## 5. Conceptual Data Model

### User
- `user_id`
- `email`
- `password_hash`
- `created_at`

### Transaction
- `transaction_id`
- `user_id` (foreign key)
- `date`
- `amount`
- `category`
- `type` (income / expense)
- `account_type` (savings / credit)
- `payment_method`
- `notes`
- `created_at`

---

## 6. User Interface Design Principles

- Clean, minimal layout with high contrast
- Dashboard-first design (show value immediately)
- Friendly charts for monthly summaries
- Mobile-responsive layout
- CTA buttons: Add transaction, View report, Export

---

## 7. Security Considerations

- Use secure authentication flow (JWT or session-based)
- Hash passwords (e.g., bcrypt)
- Store user data securely (encrypted at rest where needed)
- Rate-limit API calls and validate all inputs

---

## 8. Development Phases

### 🔹 Phase 1: MVP
- Manual transaction entry
- Account separation
- Income vs Expense chart
- Spending comparison
- Edit/delete + export
- Email login

### 🔹 Phase 2: Enhanced Insights
- Category-wise breakdown
- Month-wise spending trend
- Tag/filter/search transactions
- Google Sign-In
- UI improvements and mobile optimizations

### 🔹 Phase 3: Automation & Intelligence
- Upload statements (CSV/PDF)
- Bank API integration
- Spending alerts
- Smart savings tips & analysis
- Budget setting and notifications

### 🔹 Phase 4: Mobile Expansion
- Build native mobile apps (React Native / Flutter)
- Push notifications
- Offline transaction logging

---

## 9. Potential Challenges & Solutions

| Challenge                        | Suggested Solution                                                  |
|----------------------------------|----------------------------------------------------------------------|
| Maintaining clean manual data    | Use smart defaults and validation in forms                           |
| Balancing simplicity and insights| Layer analytics gradually; keep UI minimal                           |
| Building trust for login/users   | Prioritize security and transparency with clear data ownership       |
| Data scale in long-term usage    | Use indexes and optimized queries in PostgreSQL                      |

---

## 10. Future Expansion Possibilities

- AI-powered spend analysis and forecasting
- Shared household/group accounts
- Goal-based saving tracker
- Integration with mutual fund or investment platforms
- Community-driven saving tips or leaderboard

---
