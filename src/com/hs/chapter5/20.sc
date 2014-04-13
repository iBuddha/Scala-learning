/**
 * Created by hs on 14-4-13.
 */
class Computer{
  class CPU{
    private[Computer] var model = "Intel"
  }
  def changeCPU(cpu:CPU){
    cpu.model="AMD"
  }
}
var computer= new Computer
var cpu = new computer.CPU