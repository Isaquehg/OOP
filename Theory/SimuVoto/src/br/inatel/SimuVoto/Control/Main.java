package br.inatel.SimuVoto.Control;

import br.inatel.SimuVoto.View.UIThread;

public class Main {
    public static void main(String[] args) {
        UIThread menu = new UIThread();
        menu.start();
    }
}