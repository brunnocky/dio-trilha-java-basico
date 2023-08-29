
    public class SmartTV {
        int volume = 0;
        int canal = 0;
        boolean ligada = false;

        public void ligar() {
            this.ligada = true;
            System.out.println("TV LIGADA");
        }

        public void desligar() {
            this.ligada = false;
            System.out.println("TV DESLIGADA");
        }
        public void subirCanal() {
            canal++;
            System.out.println("O canal atual é:" + canal);
        }
        public void descerCanal() {
            canal++;
            System.out.println("O canal atual é:" + canal);
        }
        public void mudarCanal(int mudarCanal) {
            canal = mudarCanal;
            System.out.println("O canal atual é:" + canal);
        }
        public void aumentarVolume() {
            volume++;
            System.out.println("O volume atual é:" + volume);
        }

        public static void main(String[] args) {
            SmartTV lg = new SmartTV();

            lg.ligar();
            lg.aumentarVolume();
            lg.aumentarVolume();
            lg.desligar();
        }
    }
