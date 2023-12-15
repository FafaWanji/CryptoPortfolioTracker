package de.fafawanji.cryptoportfoliotracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.thauvin.erik.crypto.CryptoPrice;

public class HelloController {
    @FXML
    public Label cryptoText;

    @FXML
    protected void onHelloButtonClick() {
        double summe = 0;
        StringBuilder labelText = new StringBuilder();
        double btc = 0.06544796+0.01038935;
        double eth = 0.0935225;
        double ada = 1228.93;
        double bch = 1.82636;
        double bnb = 0.24958036;
        double xrp = 872.41415417;
        double super_ = 569.91289663;
        double link_ = 9.8398821;
        double ar = 4.87933172;
        double luna = 6.15564007;
        double rndr = 122.18392647;
        double uno = 2110.37018;
        String cryptos = "BTC,ETH,ADA,BCH,BNB,XRP,SUPER,LINK,AR,LUNA,RNDR,UNO";
        String[] cryptoList = cryptos.split(",");
        double[] cryptoAmounts = {btc, eth, ada, bch, bnb, xrp, super_, link_, ar, luna, rndr, uno};
        for (int i = 0; i < cryptoList.length; i++) {
            try {
                var cryptoPreis = CryptoPrice.spotPrice(cryptoList[i], "USD");
                double cryptoportfolio = cryptoAmounts[i] * cryptoPreis.getAmount().doubleValue();
                cryptoportfolio = Math.round(cryptoportfolio * 100.0) / 100.0;
                labelText.append(cryptoList[i]).append(": $").append(cryptoportfolio).append("\n");
                summe += cryptoportfolio;

            } catch (Exception ignored) {
            }
        }
        summe = Math.round(summe * 100.0) / 100.0;
        labelText.append("Summe: $").append(summe);
        cryptoText.setText(labelText.toString());
    }
}
