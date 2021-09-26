# Interfaces de escucha de eventos en Java (Event Listener Interfaces)

Los Listeners se crean implementando una o más de las interfaces definidas por el paquete java.awt.event. Cuando ocurre un evento, el origen del evento invoca el método apropiado definido por el Listener y proporciona un objeto de evento como argumento.

## Interfaz ActionListener
Esta interfaz define el método **actionPerformed()** que se invoca cuando ocurre un evento de acción. 

La codificacion del metodo es la siguiente:
```Java
void actionPerformed(ActionEvent ae)
```
## Interfaz AdjustmentListener
Esta interfaz define el método **settingValueChanged()** que se invoca cuando se produce un evento de ajuste. 

La codificacion del metodo es la siguiente:
```Java
void adjustmentValueChanged(AdjustmentEvent ae)
```
## Interfaz ComponentListener
Esta interfaz define cuatro métodos que se invocan cuando un componente cambia de tamaño, se mueve, se muestra u oculta. 

Las codificaciones de los metodos son las siguientes:
```Java
void componentResized(ComponentEvent ce)
void componentMoved(ComponentEvent ce)
void componentShown(ComponentEvent ce)
void componentHidden(ComponentEvent ce)
``` 
## Interfaz ContainerListener
Esta interfaz contiene dos métodos. 
* Cuando se agrega un componente a un contenedor, se invoca **componentAdded()**. 
* Cuando se elimina un componente de un contenedor, se invoca **componentRemoved()**.

Las codificaciones de los metodos son las siguientes:
```Java
void componentAdded(ContainerEvent ce)
void componentRemoved(ContainerEvent ce)
```
## Interfaz FocusListener
Esta interfaz define dos métodos. 
* Cuando un componente obtiene el foco del teclado, se invoca **focusGained()**. 
* Cuando un componente pierde el foco del teclado, se llama a **focusLost()**. 

Las codificaciones de los metodos son las siguientes:
```Java
void focusGained(FocusEvent fe)
void focusLost(FocusEvent fe)
```
## Interface ItemListener
Esta interfaz define el método **itemStateChanged()** que se invoca cuando cambia el estado de un elemento. 

La codificacion del metodo es la siguiente:
```Java
void itemStateChanged(ItemEvent ie)
```
## Interfaz KeyListener
Esta interfaz define tres métodos. 
* Los métodos **keyPressed()** y **keyReleased()** se invocan cuando se presiona y suelta una tecla, respectivamente. 
* El método **keyTyped()** se invoca cuando se ingresa un carácter. 

Las codificaciones de los metodos son las siguientes:
```Java
void keyPressed(KeyEvent ke)
void keyReleased(KeyEvent ke)
void keyTyped(KeyEvent ke)
```
## Interfaz MouseListener
Esta interfaz define cinco métodos. 
* Si se presiona y se suelta el mouse en el mismo punto, se invoca **mouseClicked()**. 
* Cuando el mouse ingresa a un componente, se llama al método **mouseEntered()**. 
* Cuando sale, se llama a **mouseExited()**. 
* Los métodos **mousePressed()** y **mouseReleased()** se invocan cuando se presiona y se suelta el mouse, respectivamente. 

Las codificaciones de los metodos son las siguientes:
```Java
void mouseClicked(MouseEvent me)
void mouseEntered(MouseEvent me)
void mouseExited(MouseEvent me)
void mousePressed(MouseEvent me)
void mouseReleased(MouseEvent me)
```

## Interfaz MouseMotionListener
Esta interfaz define dos métodos. 
* El método **mouseDragged()** se llama varias veces mientras se arrastra el mouse. 
* El método **mouseMoved()** se llama varias veces a medida que se mueve el mouse. 

Las codificaciones de los metodos son las siguientes:
```java
void mouseDragged(MouseEvent me)
void mouseMoved(MouseEvent me)
```
## Interfaz MouseWheelListener
Esta interfaz define el método **mouseWheelMoved()** que se invoca cuando se mueve la rueda del mouse. 

La codificacion del metodo es la siguiente:
```java
void mouseWheelMoved(MouseWheelEvent mwe)
```
## Interfaz TextListener
Esta interfaz define el método **textChanged()** que se invoca cuando se produce un cambio en un área de texto o en un campo de texto. 

La codificacion del metodo es la siguiente:
```java
void textChanged(TextEvent te)
```
## Interfaz WindowFocusListener
Esta interfaz define dos métodos: **windowGainedFocus()** y **windowLostFocus()**, que se llaman cuando una ventana gana o pierde el foco de entrada.

Las codificaciones de los metodos son las siguientes:
```java
void windowGainedFocus(WindowEvent we)
void windowLostFocus(WindowEvent we)
```
## Interfaz WindowListener
Esta interfaz define siete métodos. 
* Los métodos **windowActivated()** y **windowDeactivated()** se invocan cuando se activa o desactiva una ventana, respectivamente. 
* Si una ventana está iconificada, se llama al método **windowIconified()**. 
* Cuando se desiconifica una ventana, se llama al método **windowDeiconified()**. Cuando se abre o se cierra una ventana, se llama a los métodos **windowOpened()** o **windowClosed()**, respectivamente. 
* El método **windowClosing()** se llama cuando se cierra una ventana.

Las codificaciones de los metodos son las siguientes:
```java
void windowActivated(WindowEvent we)
void windowClosed(WindowEvent we)
void windowClosing(WindowEvent we)
void windowDeactivated(WindowEvent we)
void windowDeiconified(WindowEvent we)
void windowIconified(WindowEvent we)
void windowOpened(WindowEvent we)
```
Referencias: 

_https://dotnettutorials.net/lesson/event-listener-interfaces-in-java/_