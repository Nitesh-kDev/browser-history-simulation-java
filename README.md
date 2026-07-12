# 🌐 Browser History Simulation (Java Mini Project)

A simple **console-based Java application** that copies how a real web browser handles page history — visiting new pages, going back, and going forward. Built to practice **core Java, OOP, and Data Structures** concepts with a real-world use case.

---

## 📌 Features

- Visit a new page (adds to history)
- Go back to the previous page
- Go forward to the next page
- Show the current page
- Menu-driven console interface (easy to use)

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts used:** OOP (Classes & Objects), `LinkedList`, `ListIterator`
- **Tool:** IntelliJ IDEA
- **Build:** Maven (`org.example` package)

---

## ⚙️ How It Works

The project has two classes:

- `Main.java` → handles the menu and user input (Scanner)
- `BrowserHistorySimulation.java` → handles the actual back/forward logic

I used a **`LinkedList`** to store visited pages, along with a **`ListIterator`** to move through that list — forward and backward — just like a browser moves through its history.

When you visit a new page, all "forward" pages ahead of the current position are removed — just like a real browser clears forward history once you visit a new page.

---

## 🐞 A Bug I Found and Fixed (My Favorite Part!)

While building `goBack()`, I hit an **off-by-one bug** — it returned the *current* page instead of the *previous* page on the first click.

I traced the issue back to how `ListIterator`'s cursor sits *between* elements, not *on* one. So calling `previous()` right after `add()` returned the just-added element itself, not the one before it.

I fixed it by calling `previous()` twice (to skip past the current page first), then restoring the cursor position with `next()` so `goForward()` still worked correctly afterward.

This taught me that **understanding how a data structure works internally** is just as important as using it — a lesson I'll carry into every project from here on.

---

## 🚀 How to Run

```bash
git clone https://github.com/your-username/browser-history-simulation-java.git
cd browser-history-simulation-java
javac Main.java BrowserHistorySimulation.java
java Main
```

---

## 📚 What I Learned

- Applying **OOP** to a real-world scenario (browser behavior)
- How **`LinkedList`** and **`ListIterator`** work internally in Java
- Why a `ListIterator`'s cursor position matters (and how it can cause subtle bugs)
- Debugging logic errors by **tracing code step-by-step**
- Writing clean, menu-driven console applications

---

## 🔮 Future Improvements

- [ ] Add a GUI using JavaFX or Swing
- [ ] Save history to a file so it persists after closing the app
- [ ] Add a "search in history" feature
- [ ] Convert to a Spring Boot REST API version

---

## 👤 Author

**Nitesh Kumar**  
MCA Student, JSSATE Noida | Aspiring Java Backend Developer  
📫 [Connect with me on LinkedIn](https://www.linkedin.com/in/nitesh-kumar-3b70bb387/)

---

⭐ If you found this project useful or interesting, feel free to star the repo!# 
