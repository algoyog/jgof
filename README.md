# jgof

This is a barebone implementation of Gang Of Four Patterns also known as Design Patterns. 
Use this project to educate and use the barebone classes defined into any source code. 

## Scope
### Behavior
The patterns that impact the software by evolving or changing of behaviour at runtume.
#### routing oriented
These patterns specialize in routing, communication impacts.
- [Chain of Responsibility (cor)](./src/main/java/org/algoyog/jgof/behavior/routing/cor/cor.md)
- Mediator
- Observer
- Command
#### process oriented
These patterns specialize in change of process/algorithm/flow based on runtime attributes.
- Strategy
- State
- Template method
- Vistior

#### data oriented
These patterns specialize in data management.
- Memento
- Iterator


### Structural
#### organizing
These patters specialize in structural management on software components.
- Composite
- Decorator
- Bridge
- Flyweight

#### interfacing
These patterns specialize in interfacing two software entities.
- Adapter
- Proxy
- Facade

### Creational
These patterns specialize in management of object creations.
- Singleton
- Abstract Factory
- Factory Method
- Builder
- Prototype

## Notes
- Remember, patterns can be combined to form various new patterns.