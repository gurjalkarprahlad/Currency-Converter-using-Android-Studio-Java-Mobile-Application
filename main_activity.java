package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editTextAmount;
private Spinner spinnerBaseCurrency;
private Spinner spinnerTargetCurrency;
private Button buttonConvert;
private TextView textViewResult;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

editTextAmount = findViewById(R.id.editTextAmount);
spinnerBaseCurrency = findViewById(R.id.spinnerBaseCurrency);
spinnerTargetCurrency = findViewById(R.id.spinnerTargetCurrency);
buttonConvert = findViewById(R.id.buttonConvert);
textViewResult = findViewById(R.id.textViewResult);

buttonConvert.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
convertCurrency();
}
});
}

private void convertCurrency() {
double amount = Double.parseDouble(editTextAmount.getText().toString());
String baseCurrency = spinnerBaseCurrency.getSelectedItem().toString();
String targetCurrency = spinnerTargetCurrency.getSelectedItem().toString();

double convertedAmount = performCurrencyConversion(amount, baseCurrency, targetCurrency);

textViewResult.setText(String.format("%.2f %s = %.2f %s", amount, baseCurrency, convertedAmount, targetCurrency));
}

private double performCurrencyConversion(double amount, String baseCurrency, String targetCurrency) {
// Implement the currency conversion logic here based on the selected currencies
// Use appropriate conversion rates or API for accurate conversion

// Placeholder conversion rates for illustration purposes
double conversionRate = 0.0;

// Replace with your own conversion logic
if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
conversionRate = 76.92;
} else if (baseCurrency.equals("USD") && targetCurrency.equals("JPY")) {
conversionRate = 109.89;
} else if (baseCurrency.equals("USD") && targetCurrency.equals("DINAR")) {
conversionRate = 0.3;
} else if (baseCurrency.equals("USD") && targetCurrency.equals("RIYAL")) {
conversionRate = 3.75;
} else if (baseCurrency.equals("USD") && targetCurrency.equals("POUND")) {
conversionRate = 0.71;
} else if (baseCurrency.equals("USD") && targetCurrency.equals("STERLING")) {
conversionRate = 0.71;
} else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
conversionRate = 0.013;
} else if (baseCurrency.equals("INR") && targetCurrency.equals("JPY")) {
conversionRate = 0.0091;
} else if (baseCurrency.equals("INR") && targetCurrency.equals("DINAR")) {
conversionRate = 3.31;
} else if (baseCurrency.equals("INR") && targetCurrency.equals("RIYAL")) {
conversionRate = 0.27;
} else if (baseCurrency.equals("INR") && targetCurrency.equals("POUND")) {
conversionRate = 1.41;
} else if (baseCurrency.equals("INR") && targetCurrency.equals("STERLING")) {
conversionRate = 1.41;
}
// Add more conditions for other currency conversions if needed

return amount * conversionRate;
}}
