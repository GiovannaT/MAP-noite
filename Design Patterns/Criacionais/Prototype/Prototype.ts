class Car {
    constructor(public brand: string, public model: string) {}
  
    clone(): Car {
      return new Car(this.brand, this.model);
    }
  }
  
  const originalCar = new Car('Toyota', 'Corolla');
  const clonedCar = originalCar.clone();
  
  console.log(originalCar);
  console.log(clonedCar);