package com.example.arturmusayelyan.task2.bookieMyExample.bookie;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */
/**
public class LobbyActivityOld extends AppBaseActivity {

    public class LobbyActivity extends BookieBaseActivity implements UserLocationListener, LocationPermissions.PermissionResultCallback, ActivityCompat.OnRequestPermissionsResultCallback {

        private ArrayList<String> permissions = new ArrayList<>();
        private LocationPermissions permissionUtils;
        private UserLocation myLocation;
        private QBadgeView badgeView;

        static Foreground.Listener foregroundListener = new Foreground.Listener() {
            public void onBecameForeground() {
                NetworkController.getNetworkController().reconnectToSocket();
            }

            public void onBecameBackground() {
                NetworkController.getNetworkController().disconnectToSocket();
            }
        };
        private FloatingActionButton fab;
        private BottomNavigationView bottomNavigationView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lobby);

            try {
                Foreground.get().addListener(foregroundListener);
            } catch (Exception e) {
                finish();
            }
            LoaderOld loader = (LoaderOld) findViewById(R.id.lobby_loader);
            DataController.getInstance().initSettingsTypes();
            initControllers();
            init();
            initBottomNavigationView();
            addFab(fab);
            addBottomNavigationView(bottomNavigationView);
            if (savedInstanceState != null) {
                findViewById(R.id.action_more).performClick();
            }
            addLoader(loader);
            getLocationAndPermissions();
        }

        private void initControllers() {
            NetworkController.getNetworkController().initNetworkController(getApplicationContext());
        }

        private void initBottomNavigationView() {

            bottomNavigationView.setOnNavigationItemSelectedListener
                    (new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            Fragment selectedFragment = null;
                            switch (item.getItemId()) {
                                case R.id.action_lobby:
                                    selectedFragment = LobbyFragment.newInstance();
                                    break;
                                case R.id.action_profile:
                                    selectedFragment = ProfileFragment.newInstance();
                                    break;
                                case R.id.action_bet_center:
                                    selectedFragment = BetCenterTabFragment.newInstance();
//                                selectedFragment = ProfileFragment.newInstance();
//                                Intent intent = new Intent(LobbyActivityOld.this, BetCenterTabFragment.class);
//                                startActivity(intent);
                                    break;
                                case R.id.action_more:
                                    selectedFragment = SettingsFragment.newInstance();
                                    break;
                            }
                            pushFragment(selectedFragment, false);
                            return true;
                        }
                    });
            BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
            pushFragment(LobbyFragment.newInstance(), false);
            setupBadge();
        }

        public void setupBadge() {
            setupBadge(-1);
        }
        public void setupBadge(int knownCount) {
            final int finalCount;
            if (knownCount >= 0) {
                finalCount = knownCount;

            } else {
                int[] unreadCount = {0, 0};
                unreadCount[0] = (DataController.getInstance().getBetCounter() != null ? DataController.getInstance().getBetCounter().getOpenBet() : 0);
                unreadCount[1] = (DataController.getInstance().getBetCounter() != null ? DataController.getInstance().getBetCounter().getMyBet() : 0);
                finalCount = unreadCount[0] + unreadCount[1];
            }

            badgeView.bindTarget(findViewById(R.id.action_bet_center))
                    .setBadgeTextSize(4, true)
                    .setGravityOffset(25f, 3f, true)
                    .setBadgeBackgroundColor(getResources().getColor(R.color.badge_icon_selected_color));

            if (finalCount > 0) {
                badgeView.setBadgeText("");
            } else {
                badgeView.hide(true);
            }
        }

        private void init() {
            fab = (FloatingActionButton) findViewById(R.id.fab);
            bottomNavigationView = (BottomNavigationView)
                    findViewById(R.id.navigation);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LobbyActivity.this, CreateBetActivity.class));
                }
            });
            badgeView = new QBadgeView(LobbyActivity.this);
        }

        @Override
        public void onBackPressed() {
            super.onBackPressed();
            showBnv();
            showFab();
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.pager);
            if (fragment != null && fragment instanceof ProfileBookmakerFragment && fragment.isVisible()) {
                ((ProfileBookmakerFragment) fragment).getGameListForUpdate();
            }
        }

        @Override
        public void onLocationTaken(Location mLastLocation) {
            updateLocation(mLastLocation.getLatitude(), mLastLocation.getLongitude());
        }

        @Override
        public void PermissionGranted(int request_code) {
            myLocation.connect();
        }

        @Override
        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                               @NonNull int[] grantResults) {
            // redirects to utils
            permissionUtils.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            myLocation.onActivityResult(requestCode, resultCode);
        }

        private void addPermissions() {
            permissionUtils = new LocationPermissions(this, this);
            permissions.add(android.Manifest.permission.ACCESS_FINE_LOCATION);
            permissions.add(android.Manifest.permission.ACCESS_COARSE_LOCATION);
            permissionUtils.checkPermission(permissions, 1);
        }

        private void getLocationAndPermissions() {
            myLocation = new UserLocation(this);
            myLocation.setUserLocationListener(this);
            addPermissions();
        }

        private void updateLocation(double longitude, double latitude) {
            Log.d("longitude, latitude",longitude +"  "+ latitude);
            StringEntity entity = CallModels.userLocationObject(longitude, latitude);
            WebServiceManager.updateLocation(this, entity, new JsonHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                    super.onSuccess(statusCode, headers, response);
                }
            });
        }

        @Override
        public void pushFragment(Fragment fragment, boolean addToBackStack) {
            if (addToBackStack) {
                hideFab();
            } else {
                showFab();
            }
            super.pushFragment(fragment, addToBackStack);
        }
}
 */
