package com.chess.engine.board;

import com.chess.engine.pieces.Piece;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;


public abstract class Tile {
    protected final int tileCoordinate ;


    private static final Map<Integer,EmptyTile>EMPTY_TILES= createAllPossibleEmptytile(); //EMPTY_TILES chache renomer partout//


    private static Map<Integer,EmptyTile>createAllPossibleEmptytile(){

        final Map<Integer , EmptyTile> emptyTileMap = new HashMap<>();

        for (int i=0 ; i< 64 ; i++) {

            emptyTileMap.put(i , new EmptyTile(i));
        }

        return ImmutableMap.copyOf(emptyTileMap);                          //possible apsence de la bibliotheque vidéo n2 reference//
    }

    public Tile createTile(final int coordinate , final Piece piece){                        //existance of statique in this line//
        return piece != null ? new OccupiedTile(tileCoordinate ,piece): EMPTY_TILES.get(tileCoordinate);

    }

    private Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;
    }
    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();


    public static final class EmptyTile extends Tile{                            //first change to remember//
        EmptyTile (final int coordinate){
            super(coordinate);
        }
        @Override
        public boolean isTileOccupied(){
            return false;
        }
        @Override
        public Piece getPiece(){
            return null;
        }
    }
    public static final class OccupiedTile extends Tile{

        private final Piece pieceOneTile ;
        private OccupiedTile(int tileCoordinate, Piece pieceOneTile) {

            super(tileCoordinate);
            this.pieceOneTile = pieceOneTile ;

        }

        @Override

        public boolean isTileOccupied(){

            return true;

        }
        @Override
        public Piece getPiece(){
            return this.pieceOneTile ;

        }

    }
}                                                //le premiere vidéo se rtermine ici //
