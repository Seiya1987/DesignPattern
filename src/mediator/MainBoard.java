package mediator;

public class MainBoard extends Mediator {
    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;
    @Override
    public void changed(Colleague colleague) {
        if(colleague instanceof CDDevice){
            handleCD(cdDevice);
        }else if(colleague instanceof CPU){
            handleCPU(cpu);
        }
    }

    private void handleCD(CDDevice cdDevice){
        cpu.decodeData(cdDevice.read());
    }

    private void handleCPU(CPU cpu){
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice){
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu){
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard){
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard){
        this.graphicsCard = graphicsCard;
    }
}
