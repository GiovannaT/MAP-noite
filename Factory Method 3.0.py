def make_doll(type):
  
  if type == "boneca":
    return Boneca()
  elif type == "boneco":
    return Boneco()
  else:
    raise ValueError("Tipo de boneca inválido")

class Boneca:
  """Uma boneca."""

  def __init__(self):
    self.name = "Boneca"
    self.gender = "female"

class Boneco:
  """Um boneco."""

  def __init__(self):
    self.name = "Boneco"
    self.gender = "male"