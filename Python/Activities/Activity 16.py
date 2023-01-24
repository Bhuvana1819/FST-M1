class car:
    'This is docsstring class represents a car'
    def __init__ (self,manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " " + "is moving")
    
    def stop(self): 
        print(self.manufacturer + " " + self.model + " " + "is Stopped")
C1 = car("Hyundai","Verna","2010","Automatic","white")
C2 = car ("BMW","BMW","2030","Automatic","Red")
C3 = car ("Jaquar","Jaquar","2020","Automatic","Silver")
C1.accelerate()
C1.stop()
C2.accelerate()
C2.stop()
C3.accelerate()
C3.stop()