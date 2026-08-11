# Java Clock App

A console-based Java application featuring a **Timer**, **Stopwatch**, and (in progress) **Live Clock**, built while working through object-oriented programming concepts from the University of Helsinki's [MOOC.fi Java course](https://java-programming.mooc.fi/).

## Features

- ⏲ **Timer** — counts down from a `mm:ss` input given by user
- ⏱ **Stopwatch** — counts up from `00:00:00`, tracking minutes, seconds, and milliseconds
- 🕐 **Live Clock** — planned, not yet implemented
- 🖥 **GUI** — planned future upgrade, currently a console application while I build up my Java/GUI skills

## Design

The core building block is `ClockHand`, a small reusable class that tracks a value with an upper limit and rolls over when it hits that limit (e.g. seconds rolling from 59 back to 0). Both `Timer` and `Stopwatch` are built by composing three `ClockHand` instances (minutes, seconds, milliseconds) rather than duplicating logic in each class.

## Project Structure

```
src/
├── App.java        # Entry point — console menu and user input handling
├── ClockHand.java  # Reusable "digit" component (value + rollover limit)
├── Stopwatch.java  # Counts up, composed of three ClockHand instances
└── Timer.java      # Counts down, composed of three ClockHand instances
```

## Getting Started

**Prerequisites:** JDK 17+ and Git

```bash
git clone https://github.com/DonLyons/clock.git
cd clock/src
javac *.java
java App
```

## Usage

Run the app and choose an option from the menu:

```
1. Clock
2. Stopwatch
3. Timer
Choice (0 - Exit): 3
Timer (mm:ss): 05:00
04:59:99
04:59:98
...
```

## Roadmap

- [ ] Implement the Live Clock option
- [ ] Add input validation for timer entry
- [ ] Build a GUI (likely JavaFX or Swing)

## What I Learned

This project was a hands-on way to apply core OOP ideas from MOOC.fi — encapsulation (each `ClockHand` manages its own state) and composition (building `Timer` and `Stopwatch` out of a shared, reusable component rather than writing separate rollover logic for each). It's intentionally a small, focused project to solidify fundamentals before moving on to a GUI.

## License

MIT