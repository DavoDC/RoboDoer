# RoboDoer

A Java Swing auto-clicker that performs randomised mouse clicks within configurable coordinate ranges and time intervals — useful for automation tasks.

![Preview1](https://github.com/DavoDC/RoboDoer/blob/master/Preview1.png)
![Preview2](https://github.com/DavoDC/RoboDoer/blob/master/Preview2.png)

## Features
- Set X and Y coordinate ranges — clicks land at a random position within the box
- Set time intervals (low/high) — clicks fire at random intervals in the range
- Choose left or right mouse button
- Start/stop with a button click

## Usage
Run the executable from `Executable/`. Set your coordinate and timing ranges, then start.

## Alternative
For a simpler no-install option, see [TinyTask](https://tinytask.net/index.html).

## Tech
- Java (Swing / `java.awt.Robot` for mouse control)
- Built with Launch4J for Windows executable packaging
