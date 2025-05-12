# TrackWise

## High-Level Goals

- Modular, reusable widget-based dashboard
- Easy integration into multiple screens/apps
- Real-time transaction updates (e.g. 10,000+ items)
- AI prediction module integration (extensible hook)
- Lightweight, testable, maintainable


## Core Design Principles

- **Pluggability**: Widget registry mechanism (WidgetFactory, DashboardHost)
- **Encapsulation**: Each widget is self-contained with UI + ViewModel + DataContract
- **Extensibility**: AI module as a plugin (CategoryPredictor interface)
- **Real-time performance**: Use LazyColumn, efficient diffing (SnapshotStateList)
- **Theme-consistent**: Compose-based DesignSystem for uniform look
