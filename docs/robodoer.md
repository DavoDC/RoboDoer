# RoboDoer

Repo: `C:\Users\David\GitHubRepos\RoboDoer` (Java) — **low priority, Java is not an active language**

**Purpose:** Auto-clicker / robot clicker app with GUI (cGUI). Used for automating clicks (e.g. "necro" — likely a game automation task).

## Pending Tasks (from TTD)
- Improve `setNumFieldVal(String nameQuery, String newText)`
- Add coordinate display — log where clicks happen, showing (Human click) vs (Robot click)
- Use scrolling text in the log (see JavaYTD repo for reference)
- Add timestamps to click log
- Thread per click — each click runs on its own thread
- Add coordinates to robo clicker and use for "necro"
- In `cGUI` constructor — start the thread there
- Mouse position via `MouseInfo.getPointerInfo().getLocation()` → `p.x`, `p.y`
