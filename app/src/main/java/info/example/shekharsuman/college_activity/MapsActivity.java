package info.example.shekharsuman.college_activity;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

       //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(31.308383,75.578200),15));
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng india = new LatLng(31.308383, 75.578200);
        mMap.addMarker(new MarkerOptions().position(india).title("Marker in ct").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.setMyLocationEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(india,41));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(41), 10000, null);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        MarkerOptions ct = new MarkerOptions().position(new LatLng(31.308383, 75.578200)).title("ct group");
        MarkerOptions ctgate = new MarkerOptions().position(new LatLng(31.308385, 75.578202)).title("CT MAIN GATE");
        MarkerOptions frontparkk = new MarkerOptions().position(new LatLng(31.308386, 75.578203)).title("CT FRONT PARK");
        MarkerOptions pnb = new MarkerOptions().position(new LatLng(31.308387, 75.578204)).title("CT PNB BANK");
        MarkerOptions busstaand = new MarkerOptions().position(new LatLng(31.308388, 75.578205)).title("CT BUS STAND");
        MarkerOptions ctpc = new MarkerOptions().position(new LatLng(31.308389, 75.578206)).title("POLYTECHNIC BLOCK");
        MarkerOptions ctgpharmacy = new MarkerOptions().position(new LatLng(31.308390, 75.578207)).title("PHARMACY BLOCK");
        MarkerOptions engblock = new MarkerOptions().position(new LatLng(31.308391, 75.578208)).title("CTIEMT ENGINEERING BLOCK");
        MarkerOptions mgmt = new MarkerOptions().position(new LatLng(31.308392, 75.578209)).title("MANAGEMENT BLOCK");
        MarkerOptions hangout = new MarkerOptions().position(new LatLng(31.308393, 75.578210)).title("HANGOUT CANTEEN");
        MarkerOptions bookstore = new MarkerOptions().position(new LatLng(31.308394, 75.578211)).title("TUCK SHOP");
        MarkerOptions audi = new MarkerOptions().position(new LatLng(31.308395, 75.578212)).title("MANJEET SINGH KAUR AUDITORIUM");
        MarkerOptions ground = new MarkerOptions().position(new LatLng(31.308396, 75.578213)).title("CT PLAY GROUND");
        mMap.addMarker(ct).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mMap.addMarker(ctgate).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mMap.addMarker(frontparkk).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        mMap.addMarker(pnb).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        mMap.addMarker(busstaand).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        mMap.addMarker(ctpc).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mMap.addMarker(ctgpharmacy).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mMap.addMarker(engblock).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        mMap.addMarker(mgmt).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mMap.addMarker(hangout).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        mMap.addMarker(bookstore).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        mMap.addMarker(audi).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mMap.addMarker(ground).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.getUiSettings().setIndoorLevelPickerEnabled(true);
        mMap.getCameraPosition();
        mMap.getUiSettings().setScrollGesturesEnabled(true);
        mMap.setTrafficEnabled(true);
        mMap.getFocusedBuilding();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}
