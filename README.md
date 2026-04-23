# MovieHub

MovieHub is a Java application inspired by platforms such as IMDB.

The application allows users to manage movies and series, create reviews and build personal watchlists.

This project was created for the **Object-Oriented Programming** course.

---

# Features

- Add movies
- Add series
- Add actors
- Add directors
- Add users
- Add reviews
- Display all movies
- Display all series
- Search productions by title
- Display reviews for a production
- Add productions to a watchlist
- Display a user's watchlist

---

# Classes

- `Production`
- `Movie`
- `Series`
- `Actor`
- `Director`
- `User`
- `Review`
- `Watchlist`
- `Genre`
- `MovieService`
- `Main`

---

# OOP Concepts Used

## Encapsulation

The classes contain private/protected attributes and getter methods.

## Inheritance

```text
Production
 ├── Movie
 └── Series
```

## Collections

The project uses multiple Java collections:

- `List`
- `Map`
- `TreeSet`

`TreeSet` is used as a sorted collection.

---

# Service Class

The `MovieService` class handles the main operations of the application:

- adding objects
- searching productions
- displaying reviews
- displaying sorted titles

---

# Main Class

The `Main` class creates objects and demonstrates the functionality of the application.

---

# Technologies

- Java
- OOP
- Java Collections Framework

---

# Project Structure

```text
MovieHub/
│
├── Main.java
├── MovieService.java
├── Production.java
├── Movie.java
├── Series.java
├── Actor.java
├── Director.java
├── User.java
├── Review.java
├── Watchlist.java
└── Genre.java
```

---

# Stage I Requirements Coverage

- [x] Minimum 8 object types
- [x] Minimum 10 actions/queries
- [x] Inheritance
- [x] Multiple collections
- [x] Sorted collection
- [x] Service class
- [x] Main class
- [x] Encapsulation through private/protected fields

---

# Result
<img width="664" height="467" alt="image" src="https://github.com/user-attachments/assets/f37bcf3d-fedc-4972-9fca-40814110d355" />
