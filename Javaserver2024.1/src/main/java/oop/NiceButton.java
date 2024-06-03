package oop;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.AWTKeyStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.MenuComponent;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusEvent.Cause;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.im.InputContext;
import java.awt.im.InputMethodRequests;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.beans.PropertyChangeListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.EventListener;
import java.util.Locale;
import java.util.Set;

import javax.accessibility.AccessibleContext;

public class NiceButton extends Button {

	@Override
	public void addNotify() {
		// TODO Auto-generated method stub
		super.addNotify();
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return super.getLabel();
	}

	@Override
	public void setLabel(String label) {
		// TODO Auto-generated method stub
		super.setLabel(label);
	}

	@Override
	public void setActionCommand(String command) {
		// TODO Auto-generated method stub
		super.setActionCommand(command);
	}

	@Override
	public String getActionCommand() {
		// TODO Auto-generated method stub
		return super.getActionCommand();
	}

	@Override
	public synchronized void addActionListener(ActionListener l) {
		// TODO Auto-generated method stub
		super.addActionListener(l);
	}

	@Override
	public synchronized void removeActionListener(ActionListener l) {
		// TODO Auto-generated method stub
		super.removeActionListener(l);
	}

	@Override
	public synchronized ActionListener[] getActionListeners() {
		// TODO Auto-generated method stub
		return super.getActionListeners();
	}

	@Override
	public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
		// TODO Auto-generated method stub
		return super.getListeners(listenerType);
	}

	@Override
	protected void processEvent(AWTEvent e) {
		// TODO Auto-generated method stub
		super.processEvent(e);
	}

	@Override
	protected void processActionEvent(ActionEvent e) {
		// TODO Auto-generated method stub
		super.processActionEvent(e);
	}

	@Override
	protected String paramString() {
		// TODO Auto-generated method stub
		return super.paramString();
	}

	@Override
	public AccessibleContext getAccessibleContext() {
		// TODO Auto-generated method stub
		return super.getAccessibleContext();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public Container getParent() {
		// TODO Auto-generated method stub
		return super.getParent();
	}

	@Override
	public synchronized void setDropTarget(DropTarget dt) {
		// TODO Auto-generated method stub
		super.setDropTarget(dt);
	}

	@Override
	public synchronized DropTarget getDropTarget() {
		// TODO Auto-generated method stub
		return super.getDropTarget();
	}

	@Override
	public GraphicsConfiguration getGraphicsConfiguration() {
		// TODO Auto-generated method stub
		return super.getGraphicsConfiguration();
	}

	@Override
	public Toolkit getToolkit() {
		// TODO Auto-generated method stub
		return super.getToolkit();
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return super.isValid();
	}

	@Override
	public boolean isDisplayable() {
		// TODO Auto-generated method stub
		return super.isDisplayable();
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return super.isVisible();
	}

	@Override
	public Point getMousePosition() throws HeadlessException {
		// TODO Auto-generated method stub
		return super.getMousePosition();
	}

	@Override
	public boolean isShowing() {
		// TODO Auto-generated method stub
		return super.isShowing();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return super.isEnabled();
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		super.setEnabled(b);
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		super.enable();
	}

	@Override
	public void enable(boolean b) {
		// TODO Auto-generated method stub
		super.enable(b);
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		super.disable();
	}

	@Override
	public boolean isDoubleBuffered() {
		// TODO Auto-generated method stub
		return super.isDoubleBuffered();
	}

	@Override
	public void enableInputMethods(boolean enable) {
		// TODO Auto-generated method stub
		super.enableInputMethods(enable);
	}

	@Override
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		super.setVisible(b);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

	@Override
	public void show(boolean b) {
		// TODO Auto-generated method stub
		super.show(b);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		super.hide();
	}

	@Override
	public Color getForeground() {
		// TODO Auto-generated method stub
		return super.getForeground();
	}

	@Override
	public void setForeground(Color c) {
		// TODO Auto-generated method stub
		super.setForeground(c);
	}

	@Override
	public boolean isForegroundSet() {
		// TODO Auto-generated method stub
		return super.isForegroundSet();
	}

	@Override
	public Color getBackground() {
		// TODO Auto-generated method stub
		return super.getBackground();
	}

	@Override
	public void setBackground(Color c) {
		// TODO Auto-generated method stub
		super.setBackground(c);
	}

	@Override
	public boolean isBackgroundSet() {
		// TODO Auto-generated method stub
		return super.isBackgroundSet();
	}

	@Override
	public Font getFont() {
		// TODO Auto-generated method stub
		return super.getFont();
	}

	@Override
	public void setFont(Font f) {
		// TODO Auto-generated method stub
		super.setFont(f);
	}

	@Override
	public boolean isFontSet() {
		// TODO Auto-generated method stub
		return super.isFontSet();
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return super.getLocale();
	}

	@Override
	public void setLocale(Locale l) {
		// TODO Auto-generated method stub
		super.setLocale(l);
	}

	@Override
	public ColorModel getColorModel() {
		// TODO Auto-generated method stub
		return super.getColorModel();
	}

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return super.getLocation();
	}

	@Override
	public Point getLocationOnScreen() {
		// TODO Auto-generated method stub
		return super.getLocationOnScreen();
	}

	@Override
	public Point location() {
		// TODO Auto-generated method stub
		return super.location();
	}

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		super.setLocation(x, y);
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		super.move(x, y);
	}

	@Override
	public void setLocation(Point p) {
		// TODO Auto-generated method stub
		super.setLocation(p);
	}

	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return super.getSize();
	}

	@Override
	public Dimension size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		super.setSize(width, height);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		super.resize(width, height);
	}

	@Override
	public void setSize(Dimension d) {
		// TODO Auto-generated method stub
		super.setSize(d);
	}

	@Override
	public void resize(Dimension d) {
		// TODO Auto-generated method stub
		super.resize(d);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return super.getBounds();
	}

	@Override
	public Rectangle bounds() {
		// TODO Auto-generated method stub
		return super.bounds();
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, width, height);
	}

	@Override
	public void reshape(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.reshape(x, y, width, height);
	}

	@Override
	public void setBounds(Rectangle r) {
		// TODO Auto-generated method stub
		super.setBounds(r);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}

	@Override
	public Rectangle getBounds(Rectangle rv) {
		// TODO Auto-generated method stub
		return super.getBounds(rv);
	}

	@Override
	public Dimension getSize(Dimension rv) {
		// TODO Auto-generated method stub
		return super.getSize(rv);
	}

	@Override
	public Point getLocation(Point rv) {
		// TODO Auto-generated method stub
		return super.getLocation(rv);
	}

	@Override
	public boolean isOpaque() {
		// TODO Auto-generated method stub
		return super.isOpaque();
	}

	@Override
	public boolean isLightweight() {
		// TODO Auto-generated method stub
		return super.isLightweight();
	}

	@Override
	public void setPreferredSize(Dimension preferredSize) {
		// TODO Auto-generated method stub
		super.setPreferredSize(preferredSize);
	}

	@Override
	public boolean isPreferredSizeSet() {
		// TODO Auto-generated method stub
		return super.isPreferredSizeSet();
	}

	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return super.getPreferredSize();
	}

	@Override
	public Dimension preferredSize() {
		// TODO Auto-generated method stub
		return super.preferredSize();
	}

	@Override
	public void setMinimumSize(Dimension minimumSize) {
		// TODO Auto-generated method stub
		super.setMinimumSize(minimumSize);
	}

	@Override
	public boolean isMinimumSizeSet() {
		// TODO Auto-generated method stub
		return super.isMinimumSizeSet();
	}

	@Override
	public Dimension getMinimumSize() {
		// TODO Auto-generated method stub
		return super.getMinimumSize();
	}

	@Override
	public Dimension minimumSize() {
		// TODO Auto-generated method stub
		return super.minimumSize();
	}

	@Override
	public void setMaximumSize(Dimension maximumSize) {
		// TODO Auto-generated method stub
		super.setMaximumSize(maximumSize);
	}

	@Override
	public boolean isMaximumSizeSet() {
		// TODO Auto-generated method stub
		return super.isMaximumSizeSet();
	}

	@Override
	public Dimension getMaximumSize() {
		// TODO Auto-generated method stub
		return super.getMaximumSize();
	}

	@Override
	public float getAlignmentX() {
		// TODO Auto-generated method stub
		return super.getAlignmentX();
	}

	@Override
	public float getAlignmentY() {
		// TODO Auto-generated method stub
		return super.getAlignmentY();
	}

	@Override
	public int getBaseline(int width, int height) {
		// TODO Auto-generated method stub
		return super.getBaseline(width, height);
	}

	@Override
	public BaselineResizeBehavior getBaselineResizeBehavior() {
		// TODO Auto-generated method stub
		return super.getBaselineResizeBehavior();
	}

	@Override
	public void doLayout() {
		// TODO Auto-generated method stub
		super.doLayout();
	}

	@Override
	public void layout() {
		// TODO Auto-generated method stub
		super.layout();
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}

	@Override
	public void invalidate() {
		// TODO Auto-generated method stub
		super.invalidate();
	}

	@Override
	public void revalidate() {
		// TODO Auto-generated method stub
		super.revalidate();
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return super.getGraphics();
	}

	@Override
	public FontMetrics getFontMetrics(Font font) {
		// TODO Auto-generated method stub
		return super.getFontMetrics(font);
	}

	@Override
	public void setCursor(Cursor cursor) {
		// TODO Auto-generated method stub
		super.setCursor(cursor);
	}

	@Override
	public Cursor getCursor() {
		// TODO Auto-generated method stub
		return super.getCursor();
	}

	@Override
	public boolean isCursorSet() {
		// TODO Auto-generated method stub
		return super.isCursorSet();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}

	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
	}

	@Override
	public void paintAll(Graphics g) {
		// TODO Auto-generated method stub
		super.paintAll(g);
	}

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		super.repaint();
	}

	@Override
	public void repaint(long tm) {
		// TODO Auto-generated method stub
		super.repaint(tm);
	}

	@Override
	public void repaint(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.repaint(x, y, width, height);
	}

	@Override
	public void repaint(long tm, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.repaint(tm, x, y, width, height);
	}

	@Override
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		super.print(g);
	}

	@Override
	public void printAll(Graphics g) {
		// TODO Auto-generated method stub
		super.printAll(g);
	}

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		return super.imageUpdate(img, infoflags, x, y, w, h);
	}

	@Override
	public Image createImage(ImageProducer producer) {
		// TODO Auto-generated method stub
		return super.createImage(producer);
	}

	@Override
	public Image createImage(int width, int height) {
		// TODO Auto-generated method stub
		return super.createImage(width, height);
	}

	@Override
	public VolatileImage createVolatileImage(int width, int height) {
		// TODO Auto-generated method stub
		return super.createVolatileImage(width, height);
	}

	@Override
	public VolatileImage createVolatileImage(int width, int height, ImageCapabilities caps) throws AWTException {
		// TODO Auto-generated method stub
		return super.createVolatileImage(width, height, caps);
	}

	@Override
	public boolean prepareImage(Image image, ImageObserver observer) {
		// TODO Auto-generated method stub
		return super.prepareImage(image, observer);
	}

	@Override
	public boolean prepareImage(Image image, int width, int height, ImageObserver observer) {
		// TODO Auto-generated method stub
		return super.prepareImage(image, width, height, observer);
	}

	@Override
	public int checkImage(Image image, ImageObserver observer) {
		// TODO Auto-generated method stub
		return super.checkImage(image, observer);
	}

	@Override
	public int checkImage(Image image, int width, int height, ImageObserver observer) {
		// TODO Auto-generated method stub
		return super.checkImage(image, width, height, observer);
	}

	@Override
	public void setIgnoreRepaint(boolean ignoreRepaint) {
		// TODO Auto-generated method stub
		super.setIgnoreRepaint(ignoreRepaint);
	}

	@Override
	public boolean getIgnoreRepaint() {
		// TODO Auto-generated method stub
		return super.getIgnoreRepaint();
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return super.contains(x, y);
	}

	@Override
	public boolean inside(int x, int y) {
		// TODO Auto-generated method stub
		return super.inside(x, y);
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return super.contains(p);
	}

	@Override
	public Component getComponentAt(int x, int y) {
		// TODO Auto-generated method stub
		return super.getComponentAt(x, y);
	}

	@Override
	public Component locate(int x, int y) {
		// TODO Auto-generated method stub
		return super.locate(x, y);
	}

	@Override
	public Component getComponentAt(Point p) {
		// TODO Auto-generated method stub
		return super.getComponentAt(p);
	}

	@Override
	public void deliverEvent(Event e) {
		// TODO Auto-generated method stub
		super.deliverEvent(e);
	}

	@Override
	public boolean postEvent(Event e) {
		// TODO Auto-generated method stub
		return super.postEvent(e);
	}

	@Override
	public synchronized void addComponentListener(ComponentListener l) {
		// TODO Auto-generated method stub
		super.addComponentListener(l);
	}

	@Override
	public synchronized void removeComponentListener(ComponentListener l) {
		// TODO Auto-generated method stub
		super.removeComponentListener(l);
	}

	@Override
	public synchronized ComponentListener[] getComponentListeners() {
		// TODO Auto-generated method stub
		return super.getComponentListeners();
	}

	@Override
	public synchronized void addFocusListener(FocusListener l) {
		// TODO Auto-generated method stub
		super.addFocusListener(l);
	}

	@Override
	public synchronized void removeFocusListener(FocusListener l) {
		// TODO Auto-generated method stub
		super.removeFocusListener(l);
	}

	@Override
	public synchronized FocusListener[] getFocusListeners() {
		// TODO Auto-generated method stub
		return super.getFocusListeners();
	}

	@Override
	public void addHierarchyListener(HierarchyListener l) {
		// TODO Auto-generated method stub
		super.addHierarchyListener(l);
	}

	@Override
	public void removeHierarchyListener(HierarchyListener l) {
		// TODO Auto-generated method stub
		super.removeHierarchyListener(l);
	}

	@Override
	public synchronized HierarchyListener[] getHierarchyListeners() {
		// TODO Auto-generated method stub
		return super.getHierarchyListeners();
	}

	@Override
	public void addHierarchyBoundsListener(HierarchyBoundsListener l) {
		// TODO Auto-generated method stub
		super.addHierarchyBoundsListener(l);
	}

	@Override
	public void removeHierarchyBoundsListener(HierarchyBoundsListener l) {
		// TODO Auto-generated method stub
		super.removeHierarchyBoundsListener(l);
	}

	@Override
	public synchronized HierarchyBoundsListener[] getHierarchyBoundsListeners() {
		// TODO Auto-generated method stub
		return super.getHierarchyBoundsListeners();
	}

	@Override
	public synchronized void addKeyListener(KeyListener l) {
		// TODO Auto-generated method stub
		super.addKeyListener(l);
	}

	@Override
	public synchronized void removeKeyListener(KeyListener l) {
		// TODO Auto-generated method stub
		super.removeKeyListener(l);
	}

	@Override
	public synchronized KeyListener[] getKeyListeners() {
		// TODO Auto-generated method stub
		return super.getKeyListeners();
	}

	@Override
	public synchronized void addMouseListener(MouseListener l) {
		// TODO Auto-generated method stub
		super.addMouseListener(l);
	}

	@Override
	public synchronized void removeMouseListener(MouseListener l) {
		// TODO Auto-generated method stub
		super.removeMouseListener(l);
	}

	@Override
	public synchronized MouseListener[] getMouseListeners() {
		// TODO Auto-generated method stub
		return super.getMouseListeners();
	}

	@Override
	public synchronized void addMouseMotionListener(MouseMotionListener l) {
		// TODO Auto-generated method stub
		super.addMouseMotionListener(l);
	}

	@Override
	public synchronized void removeMouseMotionListener(MouseMotionListener l) {
		// TODO Auto-generated method stub
		super.removeMouseMotionListener(l);
	}

	@Override
	public synchronized MouseMotionListener[] getMouseMotionListeners() {
		// TODO Auto-generated method stub
		return super.getMouseMotionListeners();
	}

	@Override
	public synchronized void addMouseWheelListener(MouseWheelListener l) {
		// TODO Auto-generated method stub
		super.addMouseWheelListener(l);
	}

	@Override
	public synchronized void removeMouseWheelListener(MouseWheelListener l) {
		// TODO Auto-generated method stub
		super.removeMouseWheelListener(l);
	}

	@Override
	public synchronized MouseWheelListener[] getMouseWheelListeners() {
		// TODO Auto-generated method stub
		return super.getMouseWheelListeners();
	}

	@Override
	public synchronized void addInputMethodListener(InputMethodListener l) {
		// TODO Auto-generated method stub
		super.addInputMethodListener(l);
	}

	@Override
	public synchronized void removeInputMethodListener(InputMethodListener l) {
		// TODO Auto-generated method stub
		super.removeInputMethodListener(l);
	}

	@Override
	public synchronized InputMethodListener[] getInputMethodListeners() {
		// TODO Auto-generated method stub
		return super.getInputMethodListeners();
	}

	@Override
	public InputMethodRequests getInputMethodRequests() {
		// TODO Auto-generated method stub
		return super.getInputMethodRequests();
	}

	@Override
	public InputContext getInputContext() {
		// TODO Auto-generated method stub
		return super.getInputContext();
	}

	@Override
	protected AWTEvent coalesceEvents(AWTEvent existingEvent, AWTEvent newEvent) {
		// TODO Auto-generated method stub
		return super.coalesceEvents(existingEvent, newEvent);
	}

	@Override
	protected void processComponentEvent(ComponentEvent e) {
		// TODO Auto-generated method stub
		super.processComponentEvent(e);
	}

	@Override
	protected void processFocusEvent(FocusEvent e) {
		// TODO Auto-generated method stub
		super.processFocusEvent(e);
	}

	@Override
	protected void processKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
		super.processKeyEvent(e);
	}

	@Override
	protected void processMouseEvent(MouseEvent e) {
		// TODO Auto-generated method stub
		super.processMouseEvent(e);
	}

	@Override
	protected void processMouseMotionEvent(MouseEvent e) {
		// TODO Auto-generated method stub
		super.processMouseMotionEvent(e);
	}

	@Override
	protected void processMouseWheelEvent(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		super.processMouseWheelEvent(e);
	}

	@Override
	protected void processInputMethodEvent(InputMethodEvent e) {
		// TODO Auto-generated method stub
		super.processInputMethodEvent(e);
	}

	@Override
	protected void processHierarchyEvent(HierarchyEvent e) {
		// TODO Auto-generated method stub
		super.processHierarchyEvent(e);
	}

	@Override
	protected void processHierarchyBoundsEvent(HierarchyEvent e) {
		// TODO Auto-generated method stub
		super.processHierarchyBoundsEvent(e);
	}

	@Override
	public boolean handleEvent(Event evt) {
		// TODO Auto-generated method stub
		return super.handleEvent(evt);
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		return super.mouseDown(evt, x, y);
	}

	@Override
	public boolean mouseDrag(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		return super.mouseDrag(evt, x, y);
	}

	@Override
	public boolean mouseUp(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		return super.mouseUp(evt, x, y);
	}

	@Override
	public boolean mouseMove(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		return super.mouseMove(evt, x, y);
	}

	@Override
	public boolean mouseEnter(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		return super.mouseEnter(evt, x, y);
	}

	@Override
	public boolean mouseExit(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		return super.mouseExit(evt, x, y);
	}

	@Override
	public boolean keyDown(Event evt, int key) {
		// TODO Auto-generated method stub
		return super.keyDown(evt, key);
	}

	@Override
	public boolean keyUp(Event evt, int key) {
		// TODO Auto-generated method stub
		return super.keyUp(evt, key);
	}

	@Override
	public boolean action(Event evt, Object what) {
		// TODO Auto-generated method stub
		return super.action(evt, what);
	}

	@Override
	public void removeNotify() {
		// TODO Auto-generated method stub
		super.removeNotify();
	}

	@Override
	public boolean gotFocus(Event evt, Object what) {
		// TODO Auto-generated method stub
		return super.gotFocus(evt, what);
	}

	@Override
	public boolean lostFocus(Event evt, Object what) {
		// TODO Auto-generated method stub
		return super.lostFocus(evt, what);
	}

	@Override
	public boolean isFocusTraversable() {
		// TODO Auto-generated method stub
		return super.isFocusTraversable();
	}

	@Override
	public boolean isFocusable() {
		// TODO Auto-generated method stub
		return super.isFocusable();
	}

	@Override
	public void setFocusable(boolean focusable) {
		// TODO Auto-generated method stub
		super.setFocusable(focusable);
	}

	@Override
	public void setFocusTraversalKeys(int id, Set<? extends AWTKeyStroke> keystrokes) {
		// TODO Auto-generated method stub
		super.setFocusTraversalKeys(id, keystrokes);
	}

	@Override
	public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {
		// TODO Auto-generated method stub
		return super.getFocusTraversalKeys(id);
	}

	@Override
	public boolean areFocusTraversalKeysSet(int id) {
		// TODO Auto-generated method stub
		return super.areFocusTraversalKeysSet(id);
	}

	@Override
	public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
		// TODO Auto-generated method stub
		super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled);
	}

	@Override
	public boolean getFocusTraversalKeysEnabled() {
		// TODO Auto-generated method stub
		return super.getFocusTraversalKeysEnabled();
	}

	@Override
	public void requestFocus() {
		// TODO Auto-generated method stub
		super.requestFocus();
	}

	@Override
	public void requestFocus(Cause cause) {
		// TODO Auto-generated method stub
		super.requestFocus(cause);
	}

	@Override
	protected boolean requestFocus(boolean temporary) {
		// TODO Auto-generated method stub
		return super.requestFocus(temporary);
	}

	@Override
	protected boolean requestFocus(boolean temporary, Cause cause) {
		// TODO Auto-generated method stub
		return super.requestFocus(temporary, cause);
	}

	@Override
	public boolean requestFocusInWindow() {
		// TODO Auto-generated method stub
		return super.requestFocusInWindow();
	}

	@Override
	public boolean requestFocusInWindow(Cause cause) {
		// TODO Auto-generated method stub
		return super.requestFocusInWindow(cause);
	}

	@Override
	protected boolean requestFocusInWindow(boolean temporary) {
		// TODO Auto-generated method stub
		return super.requestFocusInWindow(temporary);
	}

	@Override
	public Container getFocusCycleRootAncestor() {
		// TODO Auto-generated method stub
		return super.getFocusCycleRootAncestor();
	}

	@Override
	public boolean isFocusCycleRoot(Container container) {
		// TODO Auto-generated method stub
		return super.isFocusCycleRoot(container);
	}

	@Override
	public void transferFocus() {
		// TODO Auto-generated method stub
		super.transferFocus();
	}

	@Override
	public void nextFocus() {
		// TODO Auto-generated method stub
		super.nextFocus();
	}

	@Override
	public void transferFocusBackward() {
		// TODO Auto-generated method stub
		super.transferFocusBackward();
	}

	@Override
	public void transferFocusUpCycle() {
		// TODO Auto-generated method stub
		super.transferFocusUpCycle();
	}

	@Override
	public boolean hasFocus() {
		// TODO Auto-generated method stub
		return super.hasFocus();
	}

	@Override
	public boolean isFocusOwner() {
		// TODO Auto-generated method stub
		return super.isFocusOwner();
	}

	@Override
	public void add(PopupMenu popup) {
		// TODO Auto-generated method stub
		super.add(popup);
	}

	@Override
	public void remove(MenuComponent popup) {
		// TODO Auto-generated method stub
		super.remove(popup);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	public void list(PrintStream out) {
		// TODO Auto-generated method stub
		super.list(out);
	}

	@Override
	public void list(PrintStream out, int indent) {
		// TODO Auto-generated method stub
		super.list(out, indent);
	}

	@Override
	public void list(PrintWriter out) {
		// TODO Auto-generated method stub
		super.list(out);
	}

	@Override
	public void list(PrintWriter out, int indent) {
		// TODO Auto-generated method stub
		super.list(out, indent);
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.addPropertyChangeListener(listener);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.removePropertyChangeListener(listener);
	}

	@Override
	public PropertyChangeListener[] getPropertyChangeListeners() {
		// TODO Auto-generated method stub
		return super.getPropertyChangeListeners();
	}

	@Override
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.addPropertyChangeListener(propertyName, listener);
	}

	@Override
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.removePropertyChangeListener(propertyName, listener);
	}

	@Override
	public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
		// TODO Auto-generated method stub
		return super.getPropertyChangeListeners(propertyName);
	}

	@Override
	protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	protected void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	protected void firePropertyChange(String propertyName, int oldValue, int newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void firePropertyChange(String propertyName, char oldValue, char newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void firePropertyChange(String propertyName, short oldValue, short newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void firePropertyChange(String propertyName, long oldValue, long newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void firePropertyChange(String propertyName, float oldValue, float newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void firePropertyChange(String propertyName, double oldValue, double newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	@Override
	public void setComponentOrientation(ComponentOrientation o) {
		// TODO Auto-generated method stub
		super.setComponentOrientation(o);
	}

	@Override
	public ComponentOrientation getComponentOrientation() {
		// TODO Auto-generated method stub
		return super.getComponentOrientation();
	}

	@Override
	public void applyComponentOrientation(ComponentOrientation orientation) {
		// TODO Auto-generated method stub
		super.applyComponentOrientation(orientation);
	}

	@Override
	public void setMixingCutoutShape(Shape shape) {
		// TODO Auto-generated method stub
		super.setMixingCutoutShape(shape);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
