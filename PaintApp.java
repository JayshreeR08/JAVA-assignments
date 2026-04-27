//Shapes on Button Click
public void paint(Graphics g) {
    g.drawOval(50,50,100,100);
}

//Paint Brush (Mouse Event)
addMouseMotionListener(new MouseMotionAdapter() {
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.fillOval(e.getX(), e.getY(), 5, 5);
    }
});
